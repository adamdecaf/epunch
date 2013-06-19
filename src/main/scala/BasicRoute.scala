package com.decaf.epunch
import spray.routing.Directives

abstract class BasicRoute extends Directives {
  import scala.language.implicitConversions

  type Route = spray.routing.Route
  def route: Route

  lazy val StatusCodes = spray.http.StatusCodes

  val PathUUID = JavaUUID
  val PathNumber = IntNumber
  val PathString = Segment

  implicit def uuidToString(uuid: java.util.UUID) = uuid.toString
  // implicit def writesMarshaller[T: Writes] = jsonz.spray.writesMarshaller[T]
  // implicit def readsUnmarshaller[T: Reads] = jsonz.spray.readsUnmarshaller[T]
}
