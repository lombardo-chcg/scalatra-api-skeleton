package com.lombardo.app

import org.scalatra._
import org.json4s.{DefaultFormats, Formats}
import org.scalatra.json._
import org.slf4j.{Logger, LoggerFactory}

class ApiServlet extends ApiStack with JacksonJsonSupport {

  case class Greeting(language: String, content: String)

  protected implicit val jsonFormats: Formats = DefaultFormats
  val logger =  LoggerFactory.getLogger(getClass)

  before() {
    contentType = formats("json")
  }

  get("/") {
    logger.info("GET /")
    ("message" -> "hello world")
  }
}
