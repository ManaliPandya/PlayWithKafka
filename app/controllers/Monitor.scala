package controllers

import play.api._
import play.api.mvc._

object Monitor extends Controller {

  def monitorData = Action{
    Ok(views.html.monitorindex("manali"))
  }


}
