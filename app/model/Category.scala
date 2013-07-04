package model

import play.i18n.{Lang, Messages}
import controllers.Application

case class Category(name: String, link: String)

object Category {
  def categories = List(
    new Category(get("menu.cakes"), "cakes"),
    new Category(get("menu.treats"), "treats"),
    new Category(get("menu.contact"), "contact"),
    new Category(get("menu.calendar"), "calendar"),
    new Category(get("menu.about"), "about"))

  def get(property: String) = Messages.get(Lang.forCode(Application.language), property)
}

