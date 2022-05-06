object Interpolators extends App {

  val name1 = "amy"
  val name2 = "kev"
  val age1 = 15.23
  val age2 =17.55

//  val inter = s"$name1 is older than $name2 by ${age2 - age1} years"


  val inter = f"$name1%s is older than $name2%s by ${age2%.2f - age1%.2f} years"

  println(inter)

  val raw: String = raw"\n\n\n\n\n\n\nsameLine\n\n"
  println(raw)

  case class Fam (name: String, age: Int, needForSpace: String)

  val sarina = Fam("Sarina", 23, "\n\n\n\n\n\nlots\n\n\n")
  val scarlett = Fam("Scarlett", 20, raw"\n\nless\n")

  println(sarina.toString, scarlett.toString)
}
