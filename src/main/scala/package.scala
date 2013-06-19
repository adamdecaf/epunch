package com.decaf
import akka.actor.ActorSystem

package object epunch {
  lazy val EPunchActorSystem: ActorSystem = ActorSystem("epunch")
}
