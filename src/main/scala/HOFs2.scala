import scala.util.Random

object HOFs2 extends App
{



  //accepts a string (sb character), returns a string(quote) or default quote
  val aSBQuote: (Option[String]) => String = character => character match {
          case Some("Spongebob") => "Gary, Im absorbing his blows like Im made of some sort of spongy material"
          case Some("Patrick") => "Well, it may be stupid, but it’s also dumb."
          case Some("Gary") => "Meow"
          case Some ("Squidward") => "“Too bad SpongeBob’s not here to enjoy Spongebob not being here.”"
          case Some ("Sandy") => "“Don’t you DARE take the name of Texas in vain.”"
          case _ => "default"
        }

  val res = aSBQuote(Some("Sandy"))
  println(res)

  //accepts and returns a philosphy quote
  scala.util.Random

  /*
  * EXERCISE 2
  * */

//  val acceptPhilosphy: (Option[String]) => String = quote => quote match {
//    case quote.toString =>
//    case _ => "no quote"
//  }
val rand = new Random

  val quotes = Seq(
    "The unexamined life is not worth living",
    "Whereof one cannot speak, thereof one must be silent",
    "God is dead! He remains dead! And we have killed him",
    "There is but one truly serious philosophical problem, and that is suicide",
    "No man's knowledge here can go beyond his experienc",
    "The only thing I know is that I know nothing"
  )

  val aString = quotes(rand.nextInt(quotes.length))
  println(aString)


  val acceptPhilosphy: (Option[String]) => String = quote => quote match{
    case Some(quote) => quote
    case _ => quotes(rand.nextInt(quotes.length))
  }

//    val originalQuote = if (quote.isDefined){
//      quote.get
////

val n = acceptPhilosphy(None)
  println(n)

  

  }


