//
// Fundus - a cross platform application/game framework for Scala
// Copyright (c) 2013, Michael Bayne - All rights reserved.
// http://github.com/samskivert/fundus/blob/master/LICENSE

package fundus.core

abstract class System {

  /** Invokes the supplied action on a background thread. The action must not call any methods which
    * are only allowed on the app thread, nor should it access values maintained by code that
    * normally runs on the main thread. It should also assume that any other action invoked via
    * `invokeAsync` may be running in parallel with itself.
    */
  def invokeAsync (action :() => Unit)

  // TODO: logging
}
