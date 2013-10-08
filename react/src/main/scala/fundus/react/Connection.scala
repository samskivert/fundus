//
// Fundus - a cross platform application/game framework for Scala
// Copyright (c) 2013, Michael Bayne - All rights reserved.
// http://github.com/samskivert/fundus/blob/master/LICENSE

package fundus.react

/**
 * Provides a mechanism to cancel a slot or listener registration, or to perform post-registration
 * adjustment like making the registration single-shot.
 */
trait Connection extends java.io.Closeable {

  /**
   * Disconnects this registration. Subsequent events will not be dispatched to the associated slot
   * or listener.
   */
  override def close ()

  /**
   * Converts this connection into a one-shot connection. After the first time the slot or listener
   * is notified, it will automatically be disconnected.
   * @return this connection instance for convenient chaining.
   */
  def once () :Connection
}