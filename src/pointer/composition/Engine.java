package pointer.composition;

public class Engine {
    private float volume;
    private float power;

    public Engine(float volume, float power) {
        this.volume = volume;
        this.power = power;
    }

    public void start(){
        System.out.println("Engine is started. Engine volume is " + volume + ", power is " + power + ".");
    }
}
