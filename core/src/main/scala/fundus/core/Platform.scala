//
// Fundus - a cross platform application/game framework for Scala
// Copyright (c) 2013, Michael Bayne - All rights reserved.
// http://github.com/samskivert/fundus/blob/master/LICENSE

package fundus.core

/** Provides access to all of the Fundus platform services. A platform instance is obtained in an
  * app/game's per-platform bootstrap code and should be passed to the game's initialization code
  * prior to starting the platform's main loop.
  */
case class Platform (
  assets :Assets,
  audio  :Audio,
  canvas :Canvas, // TODO: change name so we can use Canvas for the 2D drawing interface?
  gfx    :Graphics,
  input  :Input,
  net    :Net,
  store  :Storage,
  sys    :System
)
