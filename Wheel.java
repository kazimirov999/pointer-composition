import java.util.Objects;

public class Wheel {
    private float presure;

    public Wheel(float v) {
        this.presure = presure;
    }

    public float getPresure() {
        return presure;
    }

    public void setPresure(float presure) {
        this.presure = presure;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Wheel)) return false;
        Wheel wheel = (Wheel) o;
        return Float.compare(wheel.getPresure(), getPresure()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPresure());
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "presure=" + presure +
                '}';
    }

    public float pump(Wheel wheel){

            System.out.println();

        if (wheel.getPresure() <= 3.0f) {
            presure = (float) (Math.random() * 10);
            System.out.println("Підкачка шини на " + presure + " атмосфер");
            return getPresure();
        }
        else {
            System.out.println("Підкачка шин не потрібна");
            return getPresure();
        }
    }
}
