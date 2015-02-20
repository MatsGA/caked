package model

case class Category(name: String, link: String)

object Category {
  def categories () = List(
    new Category("Build a cake", "cakes"),
    new Category("Cake examples", "gallery"),
    new Category("Contact", "contact"))
}

