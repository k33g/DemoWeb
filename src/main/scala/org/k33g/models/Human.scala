package org.k33g.models

class Human(val firstName: String, val lastName: String) {

  def sayHello(): String = {
    return "Hello " + firstName + " " + lastName
  }
}