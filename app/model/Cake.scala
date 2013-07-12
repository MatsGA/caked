package model

import play.api.i18n.Lang

object Cake {
  def cakes(implicit lang : Lang) = if (lang.language == "no") cakesNo else cakesEn


  val cakesNo = List(
    new Product("Norsk kake", "images/cake1.jpg", "1250 NOK")(
      <p>
        <strong>Norsk beskrivelse.</strong>
      </p>
      <br></br>
    )
  )

  val cakesEn =
    List(
      new Product("Sports Cakes", "images/football.jpg", "250 NOK")(
        <p>
          <strong>For the sports fan in your lfie!</strong>
        </p>
        <p>Fully customisable...</p>
        <ul>
          <li>Any team, any sport</li>
          <li>Any occassion- retirements, birthdays, you name it!</li>
          <li>Your team shirt, a football pitch, a logo or a combination.</li>
        </ul>
        <p>
          <strong>Currently available in vanilla, chocolate or red velvet cake.
            <abbr title="refrigurator">fridge</abbr>
            for 5 years!</strong>
        </p>
        <p>
          <small>I take no responsibility for ingesting food that has gone bad</small>
        </p>
      ),
      new Product("Great berry cake", "images/cake2.jpg", "150,-")(
        <p>
          <strong>Enjoy it on a summer day!</strong>
        </p>
        <p>You can never have too many berries. Do you want to add other types of berries? Ok, I will fix it!</p>
        <blockquote>
          <p>Bears fruit cake is the best cake you will ever eat!</p>
          <small>Delia Smith</small>
        </blockquote>
      ),
      new Product("Children crazy cake", "images/cake3.jpg", "350,-")(
        <p>
          <strong>Get your child somethign special for his or her birthday.</strong>
        </p>
          <p>I also provide soft drinks and can make a whole party arrangement if that's what you fancy! You can trust in me!</p>
      ),
      new Product("Super duper megagood cake 2", "images/cake1.jpg", "250 NOK")(
        <p>
          <strong>The perfect cake for special occasions.</strong>
        </p>
        <p>Popular amongst:</p>
        <ul>
          <li>Children</li>
          <li>Cats</li>
          <li>Firemen</li>
          <li>Students</li>
          <li>Skateboarders</li>
        </ul>
        <p>
          <strong>Can easily be enjoyed alone, keeps in the
            <abbr title="refrigurator">fridge</abbr>
            for 5 years!</strong>
        </p>
        <p>
          <small>I take no responsibility for ingesting food that has gone bad</small>
        </p>
      ),
      new Product("Great berry cake 2", "images/cake2.jpg", "150,-")(
        <p>
          <strong>Enjoy it on a summer day!</strong>
        </p>
        <p>You can never have too many berries. Do you want to add other types of berries? Ok, I will fix it!</p>
        <p>You can never have too many berries. Do you want to add other types of berries? Ok, I will fix it!</p>
        <p>You can never have too many berries. Do you want to add other types of berries? Ok, I will fix it!</p>
        <p>You can never have too many berries. Do you want to add other types of berries? Ok, I will fix it!</p>
        <p>You can never have too many berries. Do you want to add other types of berries? Ok, I will fix it!</p>
        <p>You can never have too many berries. Do you want to add other types of berries? Ok, I will fix it!</p>
        <p>You can never have too many berries. Do you want to add other types of berries? Ok, I will fix it!</p>
        <p>You can never have too many berries. Do you want to add other types of berries? Ok, I will fix it!</p>
        <p>You can never have too many berries. Do you want to add other types of berries? Ok, I will fix it!</p>
        <blockquote>
          <p>Bears fruit cake is the best cake you will ever eat!</p>
          <small>Delia Smith</small>
        </blockquote>
      ),
      new Product("Children crazy cake 2", "images/cake3.jpg", "350,-")(
        <p>
          <strong>Get your child somethign special for his or her birthday.</strong>
        </p>
        <p>I also provide soft drinks and can make a whole party arrangement if that's what you fancy! You can trust in me!</p>
      )
    )
}
