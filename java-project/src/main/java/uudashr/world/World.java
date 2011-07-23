public class World {
    
    public static void main(String[] args) {
        Mute silentRobot = new Mute(new Robot("r2"));
        silentRobot.speak("at your service"); // print nothing
        
        // to exectute other robot feature
        ((Robot)mutedRobot.getMuted()).backupData();
        
        
        Mute silentHuman = new Mute(new Human("john"));
        silentHuman.speak("Hello");// print nothing
        
        // to execute other human feature
        ((Human)silenHuman.getMuted()).sleep();
        
        
        // --------------------------------------------------
        
        IRobot mutedRobot = new MutedRobot(new Robot("r2"));
        mutedRobot.speak("at your service"); // print nothing
        
        // to execute other robot feature
        mutedRobot.backupData(); // still able to backup data
        
        
        
        IHuman mutedHuman = new MutedHuman(new Human("john"));
        mutedHuman.speak("Hello"); // print nothing
        
        // to execute other human feature
        mutedHuman.sleep(); // still able to sleep
    }
    
}
