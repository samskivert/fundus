//
// Fundus - a cross platform application/game framework for Scala
// Copyright (c) 2013, Michael Bayne - All rights reserved.
// http://github.com/samskivert/fundus/blob/master/LICENSE

package fundus.react

/** A view of a [[Value]] which may be observed, but not updated.
  */
abstract class ValueV[T] extends SignalV[T] {

  /** Returns the current value. */
  def get :T

  /** Connects `slot` to this value with priority 0; it will be invoked when the value changes. Also
    * immediately invokes `slot` with the current value.
    * @return $CONDOC
    */
  def onValueNotify (slot :T => Unit) :Connection = onValueNotifyAt(0)(slot)

  /** Connects `slot` to this value; it will be invoked when the value changes. Also immediately
    * invokes `slot` with the current value.
    * @param prio $PRIODOC
    * @return $CONDOC
    */
  def onValueNotifyAt (prio :Int)(slot :T => Unit) :Connection = {
    // connect before notifying the slot; if the slot changes the value during execution, it will
    // expect to be notified of that change; but if the slot throws an exception, we need to take
    // care of disconnecting because the returned connection will never reach the caller
    val conn = onValueAt(prio)(slot)
    try {
      slot(get)
      conn
    } catch {
      case e :Throwable => conn.close(); throw e
    }
  }

  override def hashCode = get match {
    case null => 0
    case v => v.hashCode
  }

  override def equals (other :Any) = {
    if (other == null) false
    else if (other.getClass != getClass) false
    else get == other.asInstanceOf[ValueV[_]].get
  }

  override def toString :String = {
    val cname = getClass.getName
    cname.substring(cname.lastIndexOf(".")+1) + "(" + get + ")"
  }

  /** Updates the value contained in this instance and notifies registered listeners iff said value
    * is not equal to the value already contained in this instance.
    */
  protected def updateAndNotifyIf (value :T) :T = updateAndNotify(value, false)

  /** Updates the value contained in this instance and notifies registered listeners.
    * @return the previously contained value.
    */
  protected def updateAndNotify (value :T) :T = updateAndNotify(value, true)

  /** Updates the value contained in this instance and notifies registered listeners.
    * @param force if true, the listeners will always be notified, if false the will be notified
    * only if the new value is not equal to the old value.
    * @return the previously contained value.
    */
  protected def updateAndNotify (value :T, force :Boolean) : T = {
    checkMutate()
    val ovalue = updateLocal(value)
    if (force || value != ovalue) emitChange(value, ovalue)
    ovalue
  }

  /** Emits a changed value. Default implementation immediately notifies listeners. */
  protected def emitChange (value :T, ovalue :T) = notifyEmit(value)

  /** Updates our locally stored value. Default implementation throws unsupported operation.
    * @return the previously stored value.
    */
  protected def updateLocal (value :T) :T = throw new UnsupportedOperationException
}
