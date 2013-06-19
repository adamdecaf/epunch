package com.decaf.epunch

object PingRoute extends PingRoute

class PingRoute extends BasicRoute {
  def route =
    (get & path("ping")) {
      complete("PONG")
    }
}
