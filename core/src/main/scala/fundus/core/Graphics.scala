//
// Fundus - a cross platform application/game framework for Scala
// Copyright (c) 2013, Michael Bayne - All rights reserved.
// http://github.com/samskivert/fundus/blob/master/LICENSE

package fundus.core

import fundus.gl.GLES2
import fundus.react.{Future, Signal}

abstract class Graphics {

  /** A signal emitted on each frame tick. This `Graphics` instance is emitted for convenience. */
  val frame = Signal[Graphics]()

  // TODO: orientation change notification

  /** Provides OpenGL rendering services. Must only be used on the main app thread. */
  val gl :GLES2

  /** Returns the number of milliseconds that have elapsed since the last frame. */
  def frameTime :Float

  /** Returns the scale factor between "pixels" and actual screen pixels. */
  def scaleFactor :Float

  /** Returns the width of the main screen/view in "pixels". */
  def screenWidth :Float

  /** Returns the width of the main screen/view in "pixels". */
  def screenHeight :Float

  /** Loads and decodes a bitmap, synchronously. This may be called from any thread. One can load
    * bitmaps on background threads via [[System.invokeAsync]] to avoid blocking the main app
    * thread while they are loaded and decoded.
    */
  def loadBitmap (path :String) :Bitmap

  /** Loads a bitmap from the network, via `url`. The bitmap is downloaded and decoded on a
    * background thread, and the returned future is completed (with success or failure) on the main
    * app thread.
    */
  def loadRemoteBitmap (url :String) :Future[Bitmap]
}
