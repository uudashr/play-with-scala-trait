package uudashr.world;

public class MutedRobot implements IRobot {
    private Robot robot;
    
    public MutedRobot(Robot robot) {
        this.robot = robot;
    }
    
    @Override
    public void speak(String message) {
        // not speaking
    }
    
    @Override
    public backupData() {
        robot.backupData();
    }
}
