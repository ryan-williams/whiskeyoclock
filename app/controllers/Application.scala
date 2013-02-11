package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {

  def index = Action {
    val d: DateTime = new DateTime()
    Ok(views.html.index())
  }

}
