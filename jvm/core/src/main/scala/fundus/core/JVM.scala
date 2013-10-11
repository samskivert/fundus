//
// Fundus - a cross platform application/game framework for Scala
// Copyright (c) 2013, Michael Bayne - All rights reserved.
// http://github.com/samskivert/fundus/blob/master/LICENSE

package fundus.core

/** Provides an implementation of the Fundus services for the desktop JVM. */
object JVM {

  /** Configures the JVM backend. */
  case class Config (
    /** The desired graphics scale factor. */
    val scaleFactor :Float = 1,
    /** The desired width (in "pixels") of the app window. */
    val screenWidth :Int = 800,
    /** The desired height (in "pixels") of the app window. */
    val screenHeight :Int = 600
  )

  /** Initializes the JVM backend.
    * @return a platform which can be used to initialize your app/game.
    */
  def init (config :Config) :Platform = {
    null // TODO
  }

  /** Starts the main app thread and rendering loop. */
  def run () {
    // TODO
  }
}
