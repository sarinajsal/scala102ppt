object Options extends App{

  trait chocolate {
    val colour:String
    val filling: Option[String]
  }

  case class Bounty (colour: String, filling: Option[String]) extends chocolate

  case class DairyMilk (colour: String, filling: Option[String]) extends chocolate

  val bounty = Bounty("brown", Some("Coconut"))
  val whiteDairy = DairyMilk("white", None)
  val darkDairy =  DairyMilk("brown", None)


  case class Choc (brand: String, filling: Option[String])

  val mars = Choc("dairymilk", Some("caramel"))

  def getFilling(choc: Choc): String = {
    choc.filling.getOrElse("none")
  }

  println(getFilling(mars))

  case class Dog (spotsColour: Option[String], name: String)
  val alfie = Dog(Some("brown"), "alfie")
  val ebby = Dog (None, "ebby")

  def dogSpotsColour(dog: Dog): String = {
    dog.spotsColour match {
      case Some("black") => "black spots"
      case Some("brown") => "brown spots"
      case _ => "no spots"
    }
  }

  def dogSpotColour2(dog: Dog): String = {
    dog.spotsColour.getOrElse("no spots")
  }

  println(dogSpotsColour(alfie))
  println(dogSpotsColour(ebby))
  println(dogSpotColour2(alfie))

  def num (n: Option[Int]): Int = {
    n match {
      case Some(n) => n*2
      case _ => 0
    }
  }
  println(num(None))
}
