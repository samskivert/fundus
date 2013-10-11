//
// Fundus - a cross platform application/game framework for Scala
// Copyright (c) 2013, Michael Bayne - All rights reserved.
// http://github.com/samskivert/fundus/blob/master/LICENSE

package fundus.core

import fundus.gl.GLES2
import fundus.react.Future

class JVMGraphics (config :JVM.Config) extends Graphics {

  override val gl :GLES2 = null // TODO

  override def frameTime = 0 // TODO

  override def scaleFactor = config.scaleFactor
  override def screenWidth = config.screenWidth
  override def screenHeight = config.screenHeight

  override def loadBitmap (path :String) = null // TODO
  override def loadRemoteBitmap (url :String) = Future.failure(new Exception("TODO"))
}
