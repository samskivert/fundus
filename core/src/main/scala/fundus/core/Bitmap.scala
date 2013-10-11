//
// Fundus - a cross platform application/game framework for Scala
// Copyright (c) 2013, Michael Bayne - All rights reserved.
// http://github.com/samskivert/fundus/blob/master/LICENSE

package fundus.core

import java.nio.Buffer

import fundus.gl.GLES2

/** Contains data for a bitmap image. A bitmap can be rendered into a [[Canvas]] and also uploaded
  * to the GPU to obtain a texture.
  */
abstract class Bitmap {

  /** This bitmap's width in (scale factor adjusted) "pixels". */
  def width :Float

  /** This bitmap's height in (scale factor adjusted) "pixels". */
  def height :Float

  /** This bitmap's width in non-adjusted pixels. */
  def pixelWidth :Int

  /** This bitmap's width in non-adjusted pixels. */
  def pixelHeight :Int

  /** This bitmap's scale factor. Bitmaps loaded from `@2x` resources will, for example, have a scale
    * factor of 2. The bitmap's scale factor and the screen's scale factor are combined to
    * determine how to render the bitmap at the appropriate scale.
    */
  def scaleFactor :Float

  /** The GL format constant describing the image data returned by [[glPixels]]. */
  def glFormat :Int

  /** The GL internal format constant describing the image data returned by [[glPixels]]. */
  def glInternalFormat :Int

  /** A buffer which may be supplied to [[GLES2.glTexImage2D]] &c. */
  def glPixels :Buffer
}
