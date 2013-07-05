package model

import play.api.i18n.Lang
import play.i18n.Messages

case class Category(name: String, link: String)

object Category {
  def categories (implicit lang: Lang) = List(
    new Category(get("menu.cakes"), "cakes"),
    new Category(get("menu.treats"), "treats"),
    new Category(get("menu.contact"), "contact"),
    new Category(get("menu.calendar"), "calendar"),
    new Category(get("menu.about"), "about"))

  def get(property: String)(implicit lang : Lang) = Messages.get(lang, property)
}

