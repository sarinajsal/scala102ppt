object PatternMatching extends App {

  abstract class Notification

  case class Email(sender: String, title: String, body: String) extends Notification

  case class SMS(caller: String, message: String) extends Notification

  case class VoiceRecording(contactName: String, link: String) extends Notification

  val notification: Notification = SMS("1234", "where u")

  def showNotification(notification: Notification, fromMe: String): String = {
    notification match {
      case Email(email, title, _) if fromMe.contains("me") =>
        "email from" + email + "with title:" + title + "FROM ME"
      case SMS(number, message) =>
        "SMS from " + number + "! Message: " + message
      case VoiceRecording(name, link) =>
        "Voice Recording from " + name + " - " + link
    }
  }

  val anEmail = Email("me","hello", "hi")

  println(showNotification(anEmail, fromMe))

  val fromMe = "me"

}
