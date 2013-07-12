package model

import play.api.i18n.Lang

object Treat {
  def treats(implicit lang : Lang) = if (lang.language == "no") treatsNo else treatsEn

  val treatsNo = List(
    new Product("Syltetøy for kake", "images/cake2.jpg", "150 NOK")(
      <p>
        <strong>Norsk beskrivelse.</strong>
      </p>
      <br/>
    )
  )

  val treatsEn =
    List(
      new Product("Jam for cake", "images/cake2.jpg", "150 NOK")(
        <p>
          <strong>Engrish!</strong>
        </p>
        <br/>
      )
    )

}
