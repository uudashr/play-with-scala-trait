package uudashr.world
object World extends Application {
  val robot = new Robot("r2")
  robot.speak("at your service")
  robot.backupData()
  
  val human = new Human("john")
  human.speak("Hello")
  human.sleep()
  
  val mutedRobot = new Robot("r2") with Mute
  mutedRobot.speak("at your service") // print nothing
  // still can do the other robot feature
  mutedRobot.backupData()
  
  val mutedHuman = new Human("john") with Mute
  mutedHuman.speak("Hello") // print nothing
  // still can do the other human feature
  mutedHuman.sleep()
}
