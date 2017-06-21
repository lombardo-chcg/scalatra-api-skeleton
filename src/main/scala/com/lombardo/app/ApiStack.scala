package com.lombardo.app

import org.scalatra._
import scalate.ScalateSupport
import org.fusesource.scalate.{ TemplateEngine, Binding }
import org.fusesource.scalate.layout.DefaultLayoutStrategy
import javax.servlet.http.HttpServletRequest
import collection.mutable

trait ApiStack extends ScalatraServlet with ScalateSupport {

  notFound {
    val message = "resource not found."

    response.setContentType("JSON")
    response.setStatus(404)

    s"""{ "message": "$message" }"""
  }

}
