package controllers

import play.api.mvc._
import model.{Story, Product}
import play.api.templates.Html

object Application extends Controller {

  def index = contact()

  def cakes = Action { implicit request =>
    OkWithTrim(views.html.cakes(Product.products))
  }

  def gallery = Action { implicit request =>
    OkWithTrim(views.html.gallery(Story.stories))
  }


  def contact = Action { implicit request =>
    OkWithTrim(views.html.contact())
  }

  def OkWithTrim(html: Html): Result = {
    Ok(Html(html.body.trim))
  }
}