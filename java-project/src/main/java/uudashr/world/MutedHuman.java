package uudashr.world;

public class MutedHuman implements IHuman {
    
    private Human human;
    
    public MutedHuman(Human human) {
        this.human = human;
    }
    
    @Override
    public void speak(String message) {
        // not speaking
    }
    
    @Override
    public void sleep() {
        human.sleep();
    }
    
}
