//
// Fundus - a cross platform application/game framework for Scala
// Copyright (c) 2013, Michael Bayne - All rights reserved.
// http://github.com/samskivert/fundus/blob/master/LICENSE

package fundus.react

/** A signal that emits events of type `T`. */
class Signal[T] extends SignalV[T] {

  /** Causes this signal to emit the supplied event to connected slots.
    * @throws $EXNDOC */
  def emit (event :T) = notifyEmit(event)
}

/** Helper methods for signals. */
object Signal {

  /** Creates a signal instance. */
  def apply[T] () = new Signal[T]
}
