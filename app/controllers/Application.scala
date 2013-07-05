package controllers

import play.api.mvc._
import model.Cake

object Application extends Controller {
  var language = "no"

  def index = cakes()

  def calendar = Action {
    Ok(views.html.calendar())
  }

  def about = Action {
    Ok(views.html.about())
  }

  def cakes = Action {
    Ok(views.html.cakes(Cake.cakes))
  }

  def treats = Action {
    Ok(views.html.treats())
  }

  def contact = Action {
    Ok(views.html.contact())
  }

  def setLanguage(lang: String) = {
    if(List("no", "en") contains lang) language = lang
    cakes();
  }
}