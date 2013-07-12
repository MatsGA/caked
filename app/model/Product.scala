package model

import scala.xml.NodeBuffer

case class Product(name: String, imageUrl: String, priceInfo: String)(val description: NodeBuffer)
