package org.k33g

import org.k33g.models._

object Demo extends App {

  var bob = new Human("Bob", "Morane")
  println(bob.sayHello())

  println(bob.firstName)

}
