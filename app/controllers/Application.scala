package controllers

import play.api.mvc._
import model.{Product, Treat}
import play.api.i18n.Lang
import play.api.Play.current
import play.i18n.Messages
import play.api.templates.Html

object Application extends Controller {

  def index = cakes()

  def calendar = Action { implicit request =>
    OkWithTrim(views.html.calendar())
  }

  def about = Action { implicit request =>
    if (lang.language == "no") Ok(views.html.aboutNo()) else Ok(views.html.about())
  }

  def cakes = Action { implicit request =>
    OkWithTrim(views.html.cakes(Product.products))
  }

  def inspiration = Action { implicit request =>
    OkWithTrim(views.html.inspiration(Treat.treats))
  }

  def OkWithTrim(html: Html): Result = {
    Ok(Html(html.body.trim))
  }

  def contact = Action { implicit request =>
    OkWithTrim(views.html.contact())
  }

  def tweeted = Action {
    implicit request =>
      val referrer = request.headers.get(REFERER).getOrElse("/")
      Redirect(referrer).flashing("tweeted" -> Messages.get(lang, "contact.tweeted.text"))
  }

  def setLanguage(lang: String) = Action {
    implicit request =>
      val referrer = request.headers.get(REFERER).getOrElse("/")
      Redirect(referrer).withLang(Lang(lang))
  }
}