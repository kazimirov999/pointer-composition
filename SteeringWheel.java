import java.util.Objects;

public class SteeringWheel {
    private float position = 0.0f;

    public SteeringWheel(float position) {
        this.position = position;
    }

    public float getPosition() {
        return position;
    }

    public void setPosition(float position) {
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SteeringWheel)) return false;
        SteeringWheel that = (SteeringWheel) o;
        return Float.compare(that.getPosition(), getPosition()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPosition());
    }

    @Override
    public String toString() {
        return "SteeringWheel{" +
                "position=" + position +
                '}';
    }

    void turn(SteeringWheel steeringWheel) {
        final int DEGREE = 3; // ступінна градація оборотів керма

            this.position = steeringWheel.position * DEGREE;

            if (position == 0)
                System.out.println("Їдемо прямо...");
            else if (position < 0 && position >= -45)
                System.out.println("Ухил вліво...");
            else if (position < 0 && position < -45)
                System.out.println("Різкий поворот вліво...");
            else if (position > 0 && position <= 45)
                System.out.println("Ухил вправо...");
            else if (position > 0 && position > 45)
                System.out.println("Різкий поворот вправо...");
        }
}
