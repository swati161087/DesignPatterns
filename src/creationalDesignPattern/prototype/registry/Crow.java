package creationalDesignPattern.prototype.registry;

public class Crow extends Bird{
    private int sound;
    public Crow(Crow old){
        super(old);
        this.sound=old.sound;
    }
    Crow(){
        super();
    }
    public Crow copy(){
        return new Crow(this);
    }
    public void setSound(int sound) {
        this.sound = sound;
    }
}
