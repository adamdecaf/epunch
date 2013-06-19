package com.decaf.epunch
import spray.routing.SimpleRoutingApp

class HttpServerActor(host: String, port: Int) extends SimpleRoutingApp {
  implicit val system = EPunchActorSystem

  startServer(host, port) {
    PingRoute.route
  }
}
