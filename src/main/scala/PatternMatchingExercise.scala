object PatternMatchingExercise extends App {

  case class Icecream (flavour: String)

  val choc = Icecream("choc")

 val doeschocmatch = choc match {
   case Icecream("caramel") => "carmel chew chew"
   case Icecream("choc") => "choc fudge brownie"
   case _ => "original"
 }

println(doeschocmatch)

  case class pizza (size: Int, crust: String)
  val smallStuffed = pizza(9, "stuffed")

//  val nine = pizza(9)
//
//  val does9Match = nine match {
//    case pizza(7) => "personal"
//    case pizza(9) => "small"
//    case pizza(12) => "medium"
//    case pizza(14) => "large"
//    case _ => "medium"
//  }
//  println(does9Match)

  val pizzamatch = smallStuffed match {
    case pizza(7, "classic") => 5.99
    case pizza(9, "classic") => 10.99
    case pizza(9, "italian") => 10.99
    case pizza(12, "classic") => 12.99
    case pizza(12, "italian") => 12.99
    case pizza(12, "stuffed") => 12.99 +2.99
    case pizza(14, "classic") => 14.99
    case pizza(14, "italian") => 14.99
    case pizza(14, "stuffed") => 14.99 + 2.99
    case _ => "medium"
  }

  case class Capital (capital: String)
  val london = Capital("london")

  def isCapitalCity (cap: String): String = {
    cap match {
      case "london" => "London"
      case "edinburgh" => "Edinburgh"
      case "cardiff" => "Cardiff"
      case "belfast" => "Belfast"
      case _ => s"$cap is not a capital city of the uk"

    }
  }

  println(isCapitalCity("london"))

  abstract class Animal {
    val name: String
    val age: Int
  }

  class Dog extends Animal{
    val name: String = "george"
    val age: Int = 3
  }

  class Cat extends Animal {
    override val name: String = "sam"
    override val age: Int = 11
  }

  val acat = new Cat

  def checkAnimal (animal: Animal): String = {
    animal match{
      case d: Dog => "dog"
      case c: Cat => "kitty"
      case _ => "no animal"
    }
  }

  println(checkAnimal(acat))

  def isCalledSam (animal: Animal): String = {
    animal.name match {
      case "sam" => s"s${animal.name}'s name is sam and they are ${animal.age} years old"
      case _ => "this animal is not called sam"
    }
  }

  println(isCalledSam(acat))

  def olderThan10 (animal: Animal): String = {
    animal.age match{
      case a if animal.age>=10 => s"animal is old"
      case _ => "animal is young"
    }
  }

  println(olderThan10(acat))
}
