package controllers

import play.api.mvc._
import model.Cake
import play.api.i18n.Lang
import play.api.Play.current

object Application extends Controller {

  def index = cakes()

  def calendar = Action { implicit request =>
    Ok(views.html.calendar())
  }

  def about = Action { implicit request =>
    Ok(views.html.about())
  }

  def cakes = Action { implicit request =>
    Ok(views.html.cakes(Cake.cakes))
  }

  def treats = Action { implicit request =>
    Ok(views.html.treats())
  }

  def contact = Action { implicit request =>
    Ok(views.html.contact())
  }

  def setLanguage(lang: String) = Action {
    implicit request =>
      val referrer = request.headers.get(REFERER).getOrElse("/")
      Redirect(referrer).withLang(Lang(lang))
  }
}