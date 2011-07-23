package uudashr.world
abstract class Speakable {
  val name: String
  def speak(message: String) {
    println(name + ": " + message)
  }
}
