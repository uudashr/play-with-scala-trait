package uudashr.world;

public class Mute extends Speakable {
    
    private Speakable muted;
    
    public Mute(Speakable speakable) {
        this.speakable = spspeakable;
    }
    
    @Override
    public void speak(String message) {
        // mute, do not speak
    }
    
    public Speakable getMuted() {
        return muted;
    }
}
