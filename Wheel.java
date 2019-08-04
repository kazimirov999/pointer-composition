public class Wheel {
    private float pressure;
    private static final float MAX_PRESSURE = 3.2f;

    public Wheel(float pressure) {
        this.pressure = pressure;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    void pump() {
        pressure = MAX_PRESSURE;
    }
}
