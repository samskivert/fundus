//
// Fundus - a cross platform application/game framework for Scala
// Copyright (c) 2013, Michael Bayne - All rights reserved.
// http://github.com/samskivert/fundus/blob/master/LICENSE

package fundus.react

/** A bunch of implementation details that you should ignore, but can make use of if you're
  * extending the library with your own reactive classes.
  */
object Impl {

  /** Implements [[Connection]] and a linked-list style listener list for [[Reactor]]s.
    */
  class Cons[L](
    /** The reactor that owns this cons cell. */
    val owner :Reactor[L],
    /** The priority of this connection. */
    val priority :Int,
    /** Receives signals from the reactor. */
    val listener :L
  ) extends Connection {
    /** The next connection in our chain. */
    var next :Cons[L] = _
    /** Indicates whether this connection is one-shot or persistent. */
    var oneShot :Boolean = false

    def setNext (next :Cons[L]) :Cons[L] = { this.next = next; this }

    override def once () = { oneShot = true; this }
    override def close () = owner.disconnect(this)
    override def toString =
      s"[owner=$owner, prio=$priority, lner=$listener, hasNext=${ next != null }, oneShot=$oneShot]"
  }

  /** Plumbing to implement mapped signals in such a way that they automatically manage a connection
    * to their underlying signal. When the mapped signal adds its first connection, it establishes
    * a connection to the underlying signal, and when it removes its last connection it clears its
    * connection from the underlying signal.
    */
  abstract class MappedSignal[T] extends SignalV[T] {

    /** Establishes a connection to our source signal. Called when go from zero to one listeners.
      * When we go from one to zero listeners, the connection will automatically be cleared.
      * @return the newly established connection.
      */
    protected def connect () :Connection

    // connectionAdded and connectionRemoved are only ever called with a lock held on this reactor,
    // so we're safe in checking and mutating _conn

    override protected def connectionAdded () {
      super.connectionAdded()
      if (_conn == null) _conn = connect()
    }

    override protected def connectionRemoved () {
      super.connectionRemoved()
      if (!hasConnections && _conn != null) {
        _conn.close()
        _conn = null
      }
    }

    protected var _conn :Connection = _
  }

  abstract class Runs extends Runnable {
    var next :Runs = _
  }

  final val DISPATCHING = new Cons(null, 0, null)

  def insert[L] (head :Cons[L], cons :Cons[L]) :Cons[L] = {
    if (head == null) cons
    else if (head.priority < cons.priority) cons.setNext(head)
    else head.setNext(insert(head.next, cons))
  }

  def remove[L] (head :Cons[L], cons :Cons[L]) :Cons[L] = {
    if (head == null) head
    else if (head == cons) head.next
    else head.setNext(remove(head.next, cons))
  }

  def removeAll[L] (head :Cons[L], listener :Object) :Cons[L] = {
    if (head == null) null
    else if (head.listener == listener) removeAll(head.next, listener)
    else head.setNext(removeAll(head.next, listener))
  }

  def insert (head :Runs, action :Runs) :Runs = {
    if (head == null) action
    else {
      head.next = insert(head.next, action)
      head
    }
  }
}
