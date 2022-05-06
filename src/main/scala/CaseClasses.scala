object CaseClasses extends App {


  case class Dogs (name: String, breed: String, age:Int)

  val Sembei = Dogs("Sembei", "Cockapoo", 12)
  val Ebby = Dogs ("Ebby", "Cocker Spaniel", 10)
  val Alfie = Dogs("Alfie", "Cocker Spaniel", 2)
  val Lily =Dogs("Lily", "Cavapoo", 1)

  case class Kennel (kennelName: String, dogs: List[Dogs], cats: List[Cats], birds: List[Birds])

  val current = Kennel("KennelOne", List(Sembei, Lily), List(nappy), List(bigBird))

  val future = current.copy(kennelName = "newName")

  println(future.toString)

//  case class Aircraft(name: String, inService: Boolean, noBuild: Int)
//
//  val current = Aircraft("A-10 Thunderbolt II", true, 716)
//
//  val future = current.copy(inService = false)

  case class Cats (name: String, colour: String, canLoaf: Boolean)
  case class Birds (name: String, canSpeak: Boolean)

  val nappy = Cats("nappy", "black", true)
  val bigBird = Birds("Big Bird", true)


}
