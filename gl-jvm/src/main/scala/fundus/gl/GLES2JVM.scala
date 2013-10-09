//
// Fundus - a cross platform application/game framework for Scala
// Copyright (c) 2013, Michael Bayne - All rights reserved.
// http://github.com/samskivert/fundus/blob/master/LICENSE

package fundus.gl

import java.nio.{Buffer, ByteBuffer, FloatBuffer, IntBuffer}

/** An implementation of [GLES2] via JOGL. Mostly auto-generated, so avert your eyes. */
class GLES2JVM (gl :javax.media.opengl.GLES2) extends GLES2 {

  override def glActiveTexture (texture :Int) =
    gl.glActiveTexture(texture)
  override def glAttachShader (program :Int, shader :Int) =
    gl.glAttachShader(program, shader)
  override def glBindAttribLocation (program :Int, index :Int, name :String) =
    gl.glBindAttribLocation(program, index, name)
  override def glBindBuffer (target :Int, buffer :Int) =
    gl.glBindBuffer(target, buffer)
  override def glBindFramebuffer (target :Int, framebuffer :Int) =
    gl.glBindFramebuffer(target, framebuffer)
  override def glBindRenderbuffer (target :Int, renderbuffer :Int) =
    gl.glBindRenderbuffer(target, renderbuffer)
  override def glBindTexture (target :Int, texture :Int) =
    gl.glBindTexture(target, texture)
  override def glBlendColor (red :Float, green :Float, blue :Float, alpha :Float) =
    gl.glBlendColor(red, green, blue, alpha)
  override def glBlendEquation (mode :Int) =
    gl.glBlendEquation(mode)
  override def glBlendEquationSeparate (modeRGB :Int, modeAlpha :Int) =
    gl.glBlendEquationSeparate(modeRGB, modeAlpha)
  override def glBlendFunc (sfactor :Int, dfactor :Int) =
    gl.glBlendFunc(sfactor, dfactor)
  override def glBlendFuncSeparate (srcRGB :Int, dstRGB :Int, srcAlpha :Int, dstAlpha :Int) =
    gl.glBlendFuncSeparate(srcRGB, dstRGB, srcAlpha, dstAlpha)
  override def glBufferData (target :Int, size :Int, data :Buffer, usage :Int) =
    gl.glBufferData(target, size, data, usage)
  override def glBufferSubData (target :Int, offset :Int, size :Int, data :Buffer) =
    gl.glBufferSubData(target, offset, size, data)
  override def glCheckFramebufferStatus (target :Int) =
    gl.glCheckFramebufferStatus(target)
  override def glClear (mask :Int) =
    gl.glClear(mask)
  override def glClearColor (red :Float, green :Float, blue :Float, alpha :Float) =
    gl.glClearColor(red, green, blue, alpha)
  override def glClearDepthf (depth :Float) =
    gl.glClearDepthf(depth)
  override def glClearStencil (s :Int) =
    gl.glClearStencil(s)
  override def glColorMask (red :Boolean, green :Boolean, blue :Boolean, alpha :Boolean) =
    gl.glColorMask(red, green, blue, alpha)
  override def glCompileShader (shader :Int) =
    gl.glCompileShader(shader)
  override def glCompressedTexImage2D (target :Int, level :Int, internalformat :Int, width :Int, height :Int, border :Int, imageSize :Int, data :Buffer) =
    gl.glCompressedTexImage2D(target, level, internalformat, width, height, border, imageSize, data)
  override def glCompressedTexSubImage2D (target :Int, level :Int, xoffset :Int, yoffset :Int, width :Int, height :Int, format :Int, imageSize :Int, data :Buffer) =
    gl.glCompressedTexSubImage2D(target, level, xoffset, yoffset, width, height, format, imageSize, data)
  override def glCopyTexImage2D (target :Int, level :Int, internalformat :Int, x :Int, y :Int, width :Int, height :Int, border :Int) =
    gl.glCopyTexImage2D(target, level, internalformat, x, y, width, height, border)
  override def glCopyTexSubImage2D (target :Int, level :Int, xoffset :Int, yoffset :Int, x :Int, y :Int, width :Int, height :Int) =
    gl.glCopyTexSubImage2D(target, level, xoffset, yoffset, x, y, width, height)
  override def glCreateProgram () =
    gl.glCreateProgram()
  override def glCreateShader (typ :Int) =
    gl.glCreateShader(typ)
  override def glCullFace (mode :Int) =
    gl.glCullFace(mode)
  override def glDeleteBuffers (n :Int, buffers :IntBuffer) =
    gl.glDeleteBuffers(n, buffers)
  override def glDeleteFramebuffers (n :Int, framebuffers :IntBuffer) =
    gl.glDeleteFramebuffers(n, framebuffers)
  override def glDeleteProgram (program :Int) =
    gl.glDeleteProgram(program)
  override def glDeleteRenderbuffers (n :Int, renderbuffers :IntBuffer) =
    gl.glDeleteRenderbuffers(n, renderbuffers)
  override def glDeleteShader (shader :Int) =
    gl.glDeleteShader(shader)
  override def glDeleteTextures (n :Int, textures :IntBuffer) =
    gl.glDeleteTextures(n, textures)
  override def glDepthFunc (func :Int) =
    gl.glDepthFunc(func)
  override def glDepthMask (flag :Boolean) =
    gl.glDepthMask(flag)
  override def glDepthRangef (zNear :Float, zFar :Float) =
    gl.glDepthRangef(zNear, zFar)
  override def glDetachShader (program :Int, shader :Int) =
    gl.glDetachShader(program, shader)
  override def glDisable (cap :Int) =
    gl.glDisable(cap)
  override def glDisableVertexAttribArray (index :Int) =
    gl.glDisableVertexAttribArray(index)
  override def glDrawArrays (mode :Int, first :Int, count :Int) =
    gl.glDrawArrays(mode, first, count)
  override def glDrawElements (mode :Int, count :Int, typ :Int, indices :Buffer) =
    gl.glDrawElements(mode, count, typ, indices)
  override def glDrawElements (mode :Int, count :Int, typ :Int, indices :Int) =
    gl.glDrawElements(mode, count, typ, indices)
  override def glEnable (cap :Int) =
    gl.glEnable(cap)
  override def glEnableVertexAttribArray (index :Int) =
    gl.glEnableVertexAttribArray(index)
  override def glFinish () =
    gl.glFinish()
  override def glFlush () =
    gl.glFlush()
  override def glFramebufferRenderbuffer (target :Int, attachment :Int, renderbuffertarget :Int, renderbuffer :Int) =
    gl.glFramebufferRenderbuffer(target, attachment, renderbuffertarget, renderbuffer)
  override def glFramebufferTexture2D (target :Int, attachment :Int, textarget :Int, texture :Int, level :Int) =
    gl.glFramebufferTexture2D(target, attachment, textarget, texture, level)
  override def glFrontFace (mode :Int) =
    gl.glFrontFace(mode)
  override def glGenBuffers (n :Int, buffers :IntBuffer) =
    gl.glGenBuffers(n, buffers)
  override def glGenFramebuffers (n :Int, framebuffers :IntBuffer) =
    gl.glGenFramebuffers(n, framebuffers)
  override def glGenRenderbuffers (n :Int, renderbuffers :IntBuffer) =
    gl.glGenRenderbuffers(n, renderbuffers)
  override def glGenTextures (n :Int, textures :IntBuffer) =
    gl.glGenTextures(n, textures)
  override def glGenerateMipmap (target :Int) =
    gl.glGenerateMipmap(target)
  override def glGetAttachedShaders (program :Int, maxcount :Int, count :IntBuffer, shaders :IntBuffer) =
    gl.glGetAttachedShaders(program, maxcount, count, shaders)
  override def glGetAttribLocation (program :Int, name :String) =
    gl.glGetAttribLocation(program, name)
  override def glGetBooleanv (pname :Int, params :ByteBuffer) =
    gl.glGetBooleanv(pname, params)
  override def glGetBufferParameteriv (target :Int, pname :Int, params :IntBuffer) =
    gl.glGetBufferParameteriv(target, pname, params)
  override def glGetError () =
    gl.glGetError()
  override def glGetFloatv (pname :Int, params :FloatBuffer) =
    gl.glGetFloatv(pname, params)
  override def glGetFramebufferAttachmentParameteriv (target :Int, attachment :Int, pname :Int, params :IntBuffer) =
    gl.glGetFramebufferAttachmentParameteriv(target, attachment, pname, params)
  override def glGetIntegerv (pname :Int, params :IntBuffer) =
    gl.glGetIntegerv(pname, params)
  override def glGetProgramiv (program :Int, pname :Int, params :IntBuffer) =
    gl.glGetProgramiv(program, pname, params)
  override def glGetRenderbufferParameteriv (target :Int, pname :Int, params :IntBuffer) =
    gl.glGetRenderbufferParameteriv(target, pname, params)
  override def glGetShaderPrecisionFormat (shadertyp :Int, precisiontyp :Int, range :IntBuffer, precision :IntBuffer) =
    gl.glGetShaderPrecisionFormat(shadertyp, precisiontyp, range, precision)
  override def glGetShaderSource (shader :Int, bufsize :Int, length :IntBuffer, source :ByteBuffer) =
    gl.glGetShaderSource(shader, bufsize, length, source)
  override def glGetShaderiv (shader :Int, pname :Int, params :IntBuffer) =
    gl.glGetShaderiv(shader, pname, params)
  override def glGetString (name :Int) =
    gl.glGetString(name)
  override def glGetTexParameterfv (target :Int, pname :Int, params :FloatBuffer) =
    gl.glGetTexParameterfv(target, pname, params)
  override def glGetTexParameteriv (target :Int, pname :Int, params :IntBuffer) =
    gl.glGetTexParameteriv(target, pname, params)
  override def glGetUniformLocation (program :Int, name :String) =
    gl.glGetUniformLocation(program, name)
  override def glGetUniformfv (program :Int, location :Int, params :FloatBuffer) =
    gl.glGetUniformfv(program, location, params)
  override def glGetUniformiv (program :Int, location :Int, params :IntBuffer) =
    gl.glGetUniformiv(program, location, params)
  override def glGetVertexAttribfv (index :Int, pname :Int, params :FloatBuffer) =
    gl.glGetVertexAttribfv(index, pname, params)
  override def glGetVertexAttribiv (index :Int, pname :Int, params :IntBuffer) =
    gl.glGetVertexAttribiv(index, pname, params)
  override def glHint (target :Int, mode :Int) =
    gl.glHint(target, mode)
  override def glIsBuffer (buffer :Int) =
    gl.glIsBuffer(buffer)
  override def glIsEnabled (cap :Int) =
    gl.glIsEnabled(cap)
  override def glIsFramebuffer (framebuffer :Int) =
    gl.glIsFramebuffer(framebuffer)
  override def glIsProgram (program :Int) =
    gl.glIsProgram(program)
  override def glIsRenderbuffer (renderbuffer :Int) =
    gl.glIsRenderbuffer(renderbuffer)
  override def glIsShader (shader :Int) =
    gl.glIsShader(shader)
  override def glIsTexture (texture :Int) =
    gl.glIsTexture(texture)
  override def glLineWidth (width :Float) =
    gl.glLineWidth(width)
  override def glLinkProgram (program :Int) =
    gl.glLinkProgram(program)
  override def glPixelStorei (pname :Int, param :Int) =
    gl.glPixelStorei(pname, param)
  override def glPolygonOffset (factor :Float, units :Float) =
    gl.glPolygonOffset(factor, units)
  override def glReadPixels (x :Int, y :Int, width :Int, height :Int, format :Int, typ :Int, pixels :Buffer) =
    gl.glReadPixels(x, y, width, height, format, typ, pixels)
  override def glReleaseShaderCompiler () =
    gl.glReleaseShaderCompiler()
  override def glRenderbufferStorage (target :Int, internalformat :Int, width :Int, height :Int) =
    gl.glRenderbufferStorage(target, internalformat, width, height)
  override def glSampleCoverage (value :Float, invert :Boolean) =
    gl.glSampleCoverage(value, invert)
  override def glScissor (x :Int, y :Int, width :Int, height :Int) =
    gl.glScissor(x, y, width, height)
  override def glShaderBinary (n :Int, shaders :IntBuffer, binaryformat :Int, binary :Buffer, length :Int) =
    gl.glShaderBinary(n, shaders, binaryformat, binary, length)
  override def glStencilFunc (func :Int, ref :Int, mask :Int) =
    gl.glStencilFunc(func, ref, mask)
  override def glStencilFuncSeparate (face :Int, func :Int, ref :Int, mask :Int) =
    gl.glStencilFuncSeparate(face, func, ref, mask)
  override def glStencilMask (mask :Int) =
    gl.glStencilMask(mask)
  override def glStencilMaskSeparate (face :Int, mask :Int) =
    gl.glStencilMaskSeparate(face, mask)
  override def glStencilOp (fail :Int, zfail :Int, zpass :Int) =
    gl.glStencilOp(fail, zfail, zpass)
  override def glStencilOpSeparate (face :Int, fail :Int, zfail :Int, zpass :Int) =
    gl.glStencilOpSeparate(face, fail, zfail, zpass)
  override def glTexImage2D (target :Int, level :Int, internalformat :Int, width :Int, height :Int, border :Int, format :Int, typ :Int, pixels :Buffer) =
    gl.glTexImage2D(target, level, internalformat, width, height, border, format, typ, pixels)
  override def glTexParameterf (target :Int, pname :Int, param :Float) =
    gl.glTexParameterf(target, pname, param)
  override def glTexParameterfv (target :Int, pname :Int, params :FloatBuffer) =
    gl.glTexParameterfv(target, pname, params)
  override def glTexParameteri (target :Int, pname :Int, param :Int) =
    gl.glTexParameteri(target, pname, param)
  override def glTexParameteriv (target :Int, pname :Int, params :IntBuffer) =
    gl.glTexParameteriv(target, pname, params)
  override def glTexSubImage2D (target :Int, level :Int, xoffset :Int, yoffset :Int, width :Int, height :Int, format :Int, typ :Int, pixels :Buffer) =
    gl.glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, typ, pixels)
  override def glUniform1f (location :Int, x :Float) =
    gl.glUniform1f(location, x)
  override def glUniform1fv (location :Int, count :Int, v :FloatBuffer) =
    gl.glUniform1fv(location, count, v)
  override def glUniform1i (location :Int, x :Int) =
    gl.glUniform1i(location, x)
  override def glUniform1iv (location :Int, count :Int, v :IntBuffer) =
    gl.glUniform1iv(location, count, v)
  override def glUniform2f (location :Int, x :Float, y :Float) =
    gl.glUniform2f(location, x, y)
  override def glUniform2fv (location :Int, count :Int, v :FloatBuffer) =
    gl.glUniform2fv(location, count, v)
  override def glUniform2i (location :Int, x :Int, y :Int) =
    gl.glUniform2i(location, x, y)
  override def glUniform2iv (location :Int, count :Int, v :IntBuffer) =
    gl.glUniform2iv(location, count, v)
  override def glUniform3f (location :Int, x :Float, y :Float, z :Float) =
    gl.glUniform3f(location, x, y, z)
  override def glUniform3fv (location :Int, count :Int, v :FloatBuffer) =
    gl.glUniform3fv(location, count, v)
  override def glUniform3i (location :Int, x :Int, y :Int, z :Int) =
    gl.glUniform3i(location, x, y, z)
  override def glUniform3iv (location :Int, count :Int, v :IntBuffer) =
    gl.glUniform3iv(location, count, v)
  override def glUniform4f (location :Int, x :Float, y :Float, z :Float, w :Float) =
    gl.glUniform4f(location, x, y, z, w)
  override def glUniform4fv (location :Int, count :Int, v :FloatBuffer) =
    gl.glUniform4fv(location, count, v)
  override def glUniform4i (location :Int, x :Int, y :Int, z :Int, w :Int) =
    gl.glUniform4i(location, x, y, z, w)
  override def glUniform4iv (location :Int, count :Int, v :IntBuffer) =
    gl.glUniform4iv(location, count, v)
  override def glUniformMatrix2fv (location :Int, count :Int, transpose :Boolean, value :FloatBuffer) =
    gl.glUniformMatrix2fv(location, count, transpose, value)
  override def glUniformMatrix3fv (location :Int, count :Int, transpose :Boolean, value :FloatBuffer) =
    gl.glUniformMatrix3fv(location, count, transpose, value)
  override def glUniformMatrix4fv (location :Int, count :Int, transpose :Boolean, value :FloatBuffer) =
    gl.glUniformMatrix4fv(location, count, transpose, value)
  override def glUseProgram (program :Int) =
    gl.glUseProgram(program)
  override def glValidateProgram (program :Int) =
    gl.glValidateProgram(program)
  override def glVertexAttrib1f (idx :Int, x :Float) =
    gl.glVertexAttrib1f(idx, x)
  override def glVertexAttrib1fv (idx :Int, values :FloatBuffer) =
    gl.glVertexAttrib1fv(idx, values)
  override def glVertexAttrib2f (idx :Int, x :Float, y :Float) =
    gl.glVertexAttrib2f(idx, x, y)
  override def glVertexAttrib2fv (idx :Int, values :FloatBuffer) =
    gl.glVertexAttrib2fv(idx, values)
  override def glVertexAttrib3f (idx :Int, x :Float, y :Float, z :Float) =
    gl.glVertexAttrib3f(idx, x, y, z)
  override def glVertexAttrib3fv (idx :Int, values :FloatBuffer) =
    gl.glVertexAttrib3fv(idx, values)
  override def glVertexAttrib4f (idx :Int, x :Float, y :Float, z :Float, w :Float) =
    gl.glVertexAttrib4f(idx, x, y, z, w)
  override def glVertexAttrib4fv (idx :Int, values :FloatBuffer) =
    gl.glVertexAttrib4fv(idx, values)
  override def glVertexAttribPointer (idx :Int, size :Int, typ :Int, normalized :Boolean, stride :Int, ptr :Buffer) =
    gl.glVertexAttribPointer(idx, size, typ, normalized, stride, ptr)
  override def glVertexAttribPointer (idx :Int, size :Int, typ :Int, normalized :Boolean, stride :Int, ptr :Int) =
    gl.glVertexAttribPointer(idx, size, typ, normalized, stride, ptr)
  override def glViewport (x :Int, y :Int, width :Int, height :Int) =
    gl.glViewport(x, y, width, height)

  override def glGetActiveAttrib (program :Int, index :Int, size :IntBuffer, typ :IntBuffer) = {
    val namebs = Array.ofDim[Byte](256)
    val length = IntBuffer.allocate(1)
    gl.glGetActiveAttrib(program, index, namebs.length, length, size, typ, ByteBuffer.wrap(namebs))
    length.rewind // TODO: is this necessary?
    new String(namebs, 0, length.get)
  }
  override def glGetActiveUniform (program :Int, index :Int, size :IntBuffer, typ :IntBuffer) = {
    val namebs = Array.ofDim[Byte](256)
    val length = IntBuffer.allocate(1)
    gl.glGetActiveUniform(program, index, namebs.length, length, size, typ, ByteBuffer.wrap(namebs))
    length.rewind // TODO: is this necessary?
    new String(namebs, 0, length.get)
  }
  override def glGetProgramInfoLog (program :Int) = {
    val namebs = Array.ofDim[Byte](2048)
    val length = IntBuffer.allocate(1)
    gl.glGetProgramInfoLog(program, namebs.length, length, ByteBuffer.wrap(namebs))
    length.rewind // TODO: is this necessary?
    new String(namebs, 0, length.get)
  }
  override def glGetShaderInfoLog (shader :Int) = {
    val namebs = Array.ofDim[Byte](2048)
    val length = IntBuffer.allocate(1)
    gl.glGetShaderInfoLog(shader, namebs.length, length, ByteBuffer.wrap(namebs))
    length.rewind // TODO: is this necessary?
    new String(namebs, 0, length.get)
  }
  override def glShaderSource (shader :Int, string :String) = {
    gl.glShaderSource(shader, 1, Array(string), null)
  }
}
