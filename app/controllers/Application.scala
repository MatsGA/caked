package controllers

import play.api.mvc._
import model.{Treat, Cake}
import play.api.i18n.Lang
import play.api.Play.current

object Application extends Controller {

  def index = cakes()

  def calendar = Action { implicit request =>
    if (lang.language == "no") Ok(views.html.calendarNo()) else Ok(views.html.calendar())
  }

  def about = Action { implicit request =>
    if (lang.language == "no") Ok(views.html.aboutNo()) else Ok(views.html.about())
  }

  def cakes = Action { implicit request =>
    Ok(views.html.cakes(Cake.cakes))
  }

  def treats = Action { implicit request =>
    Ok(views.html.treats(Treat.treats))
  }

  def contact = Action { implicit request =>
    if (lang.language == "no") Ok(views.html.contactNo()) else Ok(views.html.contact())
  }

  def setLanguage(lang: String) = Action {
    implicit request =>
      val referrer = request.headers.get(REFERER).getOrElse("/")
      Redirect(referrer).withLang(Lang(lang))
  }
}