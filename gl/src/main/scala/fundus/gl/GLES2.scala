//
// Fundus - a cross platform application/game framework for Scala
// Copyright (c) 2013, Michael Bayne - All rights reserved.
// http://github.com/samskivert/fundus/blob/master/LICENSE

package fundus.gl

import java.nio.{Buffer, ByteBuffer, FloatBuffer, IntBuffer}

abstract class GLES2 {

  // these methods map one to one onto JOGL
  def glActiveTexture (texture :Int) :Unit
  def glAttachShader (program :Int, shader :Int) :Unit
  def glBindAttribLocation (program :Int, index :Int, name :String) :Unit
  def glBindBuffer (target :Int, buffer :Int) :Unit
  def glBindFramebuffer (target :Int, framebuffer :Int) :Unit
  def glBindRenderbuffer (target :Int, renderbuffer :Int) :Unit
  def glBindTexture (target :Int, texture :Int) :Unit
  def glBlendColor (red :Float, green :Float, blue :Float, alpha :Float) :Unit
  def glBlendEquation (mode :Int) :Unit
  def glBlendEquationSeparate (modeRGB :Int, modeAlpha :Int) :Unit
  def glBlendFunc (sfactor :Int, dfactor :Int) :Unit
  def glBlendFuncSeparate (srcRGB :Int, dstRGB :Int, srcAlpha :Int, dstAlpha :Int) :Unit
  def glBufferData (target :Int, size :Int, data :Buffer, usage :Int) :Unit
  def glBufferSubData (target :Int, offset :Int, size :Int, data :Buffer) :Unit
  def glCheckFramebufferStatus (target :Int) :Int
  def glClear (mask :Int) :Unit
  def glClearColor (red :Float, green :Float, blue :Float, alpha :Float) :Unit
  def glClearDepthf (depth :Float) :Unit
  def glClearStencil (s :Int) :Unit
  def glColorMask (red :Boolean, green :Boolean, blue :Boolean, alpha :Boolean) :Unit
  def glCompileShader (shader :Int) :Unit
  def glCompressedTexImage2D (target :Int, level :Int, internalformat :Int, width :Int, height :Int, border :Int, imageSize :Int, data :Buffer) :Unit
  def glCompressedTexSubImage2D (target :Int, level :Int, xoffset :Int, yoffset :Int, width :Int, height :Int, format :Int, imageSize :Int, data :Buffer) :Unit
  def glCopyTexImage2D (target :Int, level :Int, internalformat :Int, x :Int, y :Int, width :Int, height :Int, border :Int) :Unit
  def glCopyTexSubImage2D (target :Int, level :Int, xoffset :Int, yoffset :Int, x :Int, y :Int, width :Int, height :Int) :Unit
  def glCreateProgram () :Int
  def glCreateShader (typ :Int) :Int
  def glCullFace (mode :Int) :Unit
  def glDeleteBuffers (n :Int, buffers :IntBuffer) :Unit
  def glDeleteFramebuffers (n :Int, framebuffers :IntBuffer) :Unit
  def glDeleteProgram (program :Int) :Unit
  def glDeleteRenderbuffers (n :Int, renderbuffers :IntBuffer) :Unit
  def glDeleteShader (shader :Int) :Unit
  def glDeleteTextures (n :Int, textures :IntBuffer) :Unit
  def glDepthFunc (func :Int) :Unit
  def glDepthMask (flag :Boolean) :Unit
  def glDepthRangef (zNear :Float, zFar :Float) :Unit
  def glDetachShader (program :Int, shader :Int) :Unit
  def glDisable (cap :Int) :Unit
  def glDisableVertexAttribArray (index :Int) :Unit
  def glDrawArrays (mode :Int, first :Int, count :Int) :Unit
  def glDrawElements (mode :Int, count :Int, typ :Int, indices :Buffer) :Unit
  def glDrawElements (mode :Int, count :Int, typ :Int, indices :Int) :Unit
  def glEnable (cap :Int) :Unit
  def glEnableVertexAttribArray (index :Int) :Unit
  def glFinish () :Unit
  def glFlush () :Unit
  def glFramebufferRenderbuffer (target :Int, attachment :Int, renderbuffertarget :Int, renderbuffer :Int) :Unit
  def glFramebufferTexture2D (target :Int, attachment :Int, textarget :Int, texture :Int, level :Int) :Unit
  def glFrontFace (mode :Int) :Unit
  def glGenBuffers (n :Int, buffers :IntBuffer) :Unit
  def glGenFramebuffers (n :Int, framebuffers :IntBuffer) :Unit
  def glGenRenderbuffers (n :Int, renderbuffers :IntBuffer) :Unit
  def glGenTextures (n :Int, textures :IntBuffer) :Unit
  def glGenerateMipmap (target :Int) :Unit
  def glGetAttachedShaders (program :Int, maxcount :Int, count :IntBuffer, shaders :IntBuffer) :Unit
  def glGetAttribLocation (program :Int, name :String) :Int
  def glGetBooleanv (pname :Int, params :ByteBuffer) :Unit
  def glGetBufferParameteriv (target :Int, pname :Int, params :IntBuffer) :Unit
  def glGetError () :Int
  def glGetFloatv (pname :Int, params :FloatBuffer) :Unit
  def glGetFramebufferAttachmentParameteriv (target :Int, attachment :Int, pname :Int, params :IntBuffer) :Unit
  def glGetIntegerv (pname :Int, params :IntBuffer) :Unit
  def glGetProgramiv (program :Int, pname :Int, params :IntBuffer) :Unit
  def glGetRenderbufferParameteriv (target :Int, pname :Int, params :IntBuffer) :Unit
  def glGetShaderPrecisionFormat (shadertyp :Int, precisiontyp :Int, range :IntBuffer, precision :IntBuffer) :Unit
  def glGetShaderSource (shader :Int, bufsize :Int, length :IntBuffer, source :ByteBuffer) :Unit
  def glGetShaderiv (shader :Int, pname :Int, params :IntBuffer) :Unit
  def glGetString (name :Int) :String
  def glGetTexParameterfv (target :Int, pname :Int, params :FloatBuffer) :Unit
  def glGetTexParameteriv (target :Int, pname :Int, params :IntBuffer) :Unit
  def glGetUniformLocation (program :Int, name :String) :Int
  def glGetUniformfv (program :Int, location :Int, params :FloatBuffer) :Unit
  def glGetUniformiv (program :Int, location :Int, params :IntBuffer) :Unit
  def glGetVertexAttribfv (index :Int, pname :Int, params :FloatBuffer) :Unit
  def glGetVertexAttribiv (index :Int, pname :Int, params :IntBuffer) :Unit
  def glHint (target :Int, mode :Int) :Unit
  def glIsBuffer (buffer :Int) :Boolean
  def glIsEnabled (cap :Int) :Boolean
  def glIsFramebuffer (framebuffer :Int) :Boolean
  def glIsProgram (program :Int) :Boolean
  def glIsRenderbuffer (renderbuffer :Int) :Boolean
  def glIsShader (shader :Int) :Boolean
  def glIsTexture (texture :Int) :Boolean
  def glLineWidth (width :Float) :Unit
  def glLinkProgram (program :Int) :Unit
  def glPixelStorei (pname :Int, param :Int) :Unit
  def glPolygonOffset (factor :Float, units :Float) :Unit
  def glReadPixels (x :Int, y :Int, width :Int, height :Int, format :Int, typ :Int, pixels :Buffer) :Unit
  def glReleaseShaderCompiler () :Unit
  def glRenderbufferStorage (target :Int, internalformat :Int, width :Int, height :Int) :Unit
  def glSampleCoverage (value :Float, invert :Boolean) :Unit
  def glScissor (x :Int, y :Int, width :Int, height :Int) :Unit
  def glShaderBinary (n :Int, shaders :IntBuffer, binaryformat :Int, binary :Buffer, length :Int) :Unit
  def glStencilFunc (func :Int, ref :Int, mask :Int) :Unit
  def glStencilFuncSeparate (face :Int, func :Int, ref :Int, mask :Int) :Unit
  def glStencilMask (mask :Int) :Unit
  def glStencilMaskSeparate (face :Int, mask :Int) :Unit
  def glStencilOp (fail :Int, zfail :Int, zpass :Int) :Unit
  def glStencilOpSeparate (face :Int, fail :Int, zfail :Int, zpass :Int) :Unit
  def glTexImage2D (target :Int, level :Int, internalformat :Int, width :Int, height :Int, border :Int, format :Int, typ :Int, pixels :Buffer) :Unit
  def glTexParameterf (target :Int, pname :Int, param :Float) :Unit
  def glTexParameterfv (target :Int, pname :Int, params :FloatBuffer) :Unit
  def glTexParameteri (target :Int, pname :Int, param :Int) :Unit
  def glTexParameteriv (target :Int, pname :Int, params :IntBuffer) :Unit
  def glTexSubImage2D (target :Int, level :Int, xoffset :Int, yoffset :Int, width :Int, height :Int, format :Int, typ :Int, pixels :Buffer) :Unit
  def glUniform1f (location :Int, x :Float) :Unit
  def glUniform1fv (location :Int, count :Int, v :FloatBuffer) :Unit
  def glUniform1i (location :Int, x :Int) :Unit
  def glUniform1iv (location :Int, count :Int, v :IntBuffer) :Unit
  def glUniform2f (location :Int, x :Float, y :Float) :Unit
  def glUniform2fv (location :Int, count :Int, v :FloatBuffer) :Unit
  def glUniform2i (location :Int, x :Int, y :Int) :Unit
  def glUniform2iv (location :Int, count :Int, v :IntBuffer) :Unit
  def glUniform3f (location :Int, x :Float, y :Float, z :Float) :Unit
  def glUniform3fv (location :Int, count :Int, v :FloatBuffer) :Unit
  def glUniform3i (location :Int, x :Int, y :Int, z :Int) :Unit
  def glUniform3iv (location :Int, count :Int, v :IntBuffer) :Unit
  def glUniform4f (location :Int, x :Float, y :Float, z :Float, w :Float) :Unit
  def glUniform4fv (location :Int, count :Int, v :FloatBuffer) :Unit
  def glUniform4i (location :Int, x :Int, y :Int, z :Int, w :Int) :Unit
  def glUniform4iv (location :Int, count :Int, v :IntBuffer) :Unit
  def glUniformMatrix2fv (location :Int, count :Int, transpose :Boolean, value :FloatBuffer) :Unit
  def glUniformMatrix3fv (location :Int, count :Int, transpose :Boolean, value :FloatBuffer) :Unit
  def glUniformMatrix4fv (location :Int, count :Int, transpose :Boolean, value :FloatBuffer) :Unit
  def glUseProgram (program :Int) :Unit
  def glValidateProgram (program :Int) :Unit
  def glVertexAttrib1f (idx :Int, x :Float) :Unit
  def glVertexAttrib1fv (idx :Int, values :FloatBuffer) :Unit
  def glVertexAttrib2f (idx :Int, x :Float, y :Float) :Unit
  def glVertexAttrib2fv (idx :Int, values :FloatBuffer) :Unit
  def glVertexAttrib3f (idx :Int, x :Float, y :Float, z :Float) :Unit
  def glVertexAttrib3fv (idx :Int, values :FloatBuffer) :Unit
  def glVertexAttrib4f (idx :Int, x :Float, y :Float, z :Float, w :Float) :Unit
  def glVertexAttrib4fv (idx :Int, values :FloatBuffer) :Unit
  def glVertexAttribPointer (idx :Int, size :Int, typ :Int, normalized :Boolean, stride :Int, ptr :Buffer) :Unit
  def glVertexAttribPointer (idx :Int, size :Int, typ :Int, normalized :Boolean, stride :Int, ptr :Int) :Unit
  def glViewport (x :Int, y :Int, width :Int, height :Int) :Unit

  // these methods are modified somewhat to make them less annoying to implement on non-JOGL backends
  def glGetActiveAttrib (program :Int, index :Int, size :IntBuffer, typ :IntBuffer) :String
  def glGetActiveUniform (program :Int, index :Int, size :IntBuffer, typ :IntBuffer) :String
  def glGetProgramInfoLog (program :Int) :String
  def glGetShaderInfoLog (shader :Int) :String
  def glShaderSource (shader :Int, string :String) :Unit
}
