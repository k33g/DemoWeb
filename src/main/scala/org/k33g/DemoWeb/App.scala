package org.k33g.DemoWeb

import com.twitter.finatra._
import com.twitter.finatra.ContentType._
import org.k33g.models._

object App extends FinatraServer {

  class MyApp extends Controller {

    get("/") { request =>
      render.static("index.html").toFuture
    }

    get("/heroes") { request =>
      render.json(new Hero("SpiderMan")).toFuture
    }

    get("/humans/:id") { request =>
      val id = request.routeParams.getOrElse("id", null)
      val bob = new Human(id, "Bob", "Morane")

      render.json(bob).toFuture
      /*
      render.json(Map(
        "id" -> bob.id, 
        "firstName" -> bob.firstName, 
        "lastName" -> bob.lastName
      )).toFuture
      */
    }

    get("/humans") { request =>
      val bob = new Human("42", "Bob", "Morane")
      val john = new Human("00", "John", "Doe")

      render.json(Array(bob, john)).toFuture
    }

  }

  register(new MyApp())
}