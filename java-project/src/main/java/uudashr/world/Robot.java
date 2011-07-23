package uudashr.world;

public class Robot extends AbstractSpeakable implements IRobot {
    
    public Robot(String name) {
        super(name);
    }
    
    @Override
    public void backupData() {
        System.out.println("backing-up data...");
    }
    
}
