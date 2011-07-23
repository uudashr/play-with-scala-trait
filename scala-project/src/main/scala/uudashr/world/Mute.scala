package uudashr.world
trait Mute extends Speakable {
  override def speak(message: String) {
    // do nothing
  }
}
