import java.util.Objects;

public class Engine {
    private float volume;
    private float power;

    public Engine() {
    }

    public Engine(float volume, float power) {
        this.volume = volume;
        this.power = power;
    }

    public float getVolume() {
        return volume;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }

    public float getPower() {
        return power;
    }

    public void setPower(float power) {
        this.power = power;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Engine)) return false;
        Engine engine = (Engine) o;
        return Float.compare(engine.getVolume(), getVolume()) == 0 &&
                Float.compare(engine.getPower(), getPower()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getVolume(), getPower());
    }

    @Override
    public String toString() {
        return "Engine{" +
                "volume=" + volume +
                ", power=" + power +
                '}';
    }

    void start(float volume, float power){

        if (volume < 1.5f && power < 3.0){
            System.out.println("За низька потужність та малий об'єм двигуна");
            System.exit(0);
        }
        else if (power >= 3.0 && volume < 1.5f) {
            System.out.println("За малий об'єм двигуна");
            System.exit(0);
        }
        else if (power < 3.0f && volume >= 1.5f) {
            System.out.println("За низька потужність");
            System.exit(0);
        }
        else
        System.out.println("Двигун заведено...");
        System.out.println();
    }

}
