package pointer.composition;

public class Wheel {
    private float pressure;

    public float getPressure() {
        return pressure;
    }

    public void pump() {
        pressure = 3.2f;
    }
}
