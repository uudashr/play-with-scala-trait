package uudashr.world;

public class Human extends AbstractSpeakable implements IHuman {
    
    public Human(String name) {
        super(name);
    }
    
    @Override
    public void sleep() {
        System.out.println("Sleeping...zzzz");
    }
    
}
