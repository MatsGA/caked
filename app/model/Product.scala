package model

import scala.xml.NodeBuffer

case class Product(name: String, imageUrl: String)(val description: NodeBuffer)
object Product {
  val products =
    List(
      new Product("Cake Sizes", "images/sizes.jpg")(
        <p>
          <strong>Which size cake are you after?</strong>
        </p>
          <ul>
            <li>Small: 16 cm (8-10 servings)</li>
            <li>Medium: 21 cm (14-16 servings)</li>
            <li>Large: 26 cm (20-24 servings) </li>
            <li>X-Large: 31 cm (28-32 servings)</li>
          </ul>

      ),
      new Product("Cake Bases", "images/bases.jpg")(
        <p>
          <strong>Which of the current available flavours would you like?</strong>
        </p>
        <ul>
          <li>Chocolate</li>
          <li>Vanilla</li>
          <li>Red velvet </li>
          <li>Traditional british fruitcake</li>
        </ul>
      ),
      new Product("Cake Fillings", "images/fillings.jpg")(
        <p>
          <strong>What sort of filling do you want?</strong>
        </p>
        <ul>
          <li>Chocolate</li>
          <li>Vanilla</li>
          <li>Red velvet </li>
          <li>Traditional british fruitcake</li>
        </ul>
      ),
      new Product("Cake Toppings", "images/toppings.jpg")(
        <p>
          <strong>What do you want your cake covered with?</strong>
        </p>
        <ul>
          <li>Marshmallow fondant (coloured, smooth, cut outs, figurines)</li>
          <li>Buttercream (natural or coloured, smooth or piped)</li>
          <li>Ganache (natural coloured, smooth, piped)</li>
        </ul>
      )
    )
}
