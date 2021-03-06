# Fundus

Fundus is a cross platform application and game development framework for Scala. It aims to support
desktop platforms via the JVM, web-based platforms via HTML5, Android devices via Dalvik and iOS
devices via RoboVM. It is similar to cross platform game development libraries like [libGDX] and
[PlayN], but also aims to provide a cross platform user interface toolkit of sufficient quality to
enable the development of "native-like" apps, in much the same way that native-like apps are
created using HTML5 and a whole lot of CSS jockeying.

Fundus is built atop OpenGL/ES 2.0 and requires such services from the platforms on which it runs.
This means it only runs on WebGL-enabled browsers. OpenGL/ES 2.0 is pretty much a given these days
on mobile and desktop platforms.

## Components

Some of Fundus's components are sufficiently simple or fundamental that they've been isolated into
libraries that can be reused without making use of the greater Fundus framework:

  * `fundus.geom`  - a library of 2D (and someday 3D) geometry primitives and routines
  * `fundus.gl`    - OpenGL ES 2.0 minimally exposed as a Scala API

Built using these components is `fundus.core` which provides a number of different services, some
of which make use of the above components and some of which make use of one another:

  * `fundus.core.App` - app lifecycle, logging and other miscellania
  * `fundus.core.Assets` - loading text and binary data, describing paths
  * `fundus.core.Audio` - decoding and playing SFX and music
  * `fundus.core.Canvas` - 2D drawing into bitmaps, text rendering
  * `fundus.core.Input` - keyboard, mouse, and touch input
  * `fundus.core.Net` - http, websocket and (on non-HTML5 platforms) raw sockets
  * `fundus.core.Storage` - simple key/value storage, "SQL-lite" storage (on non-HTML5 platforms)

Atop this foundation, a number of additional libraries are provided:

  * `fundus.scene` - a 2D scene graph library
  * `fundus.anim` - an animation and tweening library
  * `fundus.ui` - a user interface toolkit

## Building

The Fundus libraries are published to [Maven Central] for easy integration into your build. You can
also build and install the latest SNAPSHOT version of Fundus thusly:

    sbt publish-local

This will build everything and install it into your local Ivy repository.

## License

Fundus is released under the BSD License. See the [LICENSE] file for details.

[libGDX]: https://github.com/libgdx/libgdx
[PlayN]: https://code.google.com/p/playn/
[LICENSE]: https://github.com/samskivert/fundus/blob/master/LICENSE
[Maven Central]: http://repo2.maven.org/maven2/com/samskivert/fundus/
