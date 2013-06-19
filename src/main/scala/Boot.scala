package com.decaf.epunch

object Boot {
  def main(args: Array[String]) {
    println("Booting..")

    startHttpServer()
  }

  private[this] def startHttpServer() {
    new HttpServerActor("localhost", 8080)
  }
}
