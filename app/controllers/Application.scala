package controllers

import play.api._
import play.api.mvc._
import model.Cake

object Application extends Controller {
  
  def index = Action {
    Ok(views.html.index())
  }

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
}