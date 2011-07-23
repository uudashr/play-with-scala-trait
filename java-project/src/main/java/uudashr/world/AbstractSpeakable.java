package uudashr.world;

public abstract class AbstractSpeakable implements Speakable {
    
    protected String name;
    
    public AbAbstractSpeakable(String name) {
        this.name = name;
    }
    
    @Override
    public String speak(String message) {
        System.out.println(name + ": " + message);
    }
    
}
