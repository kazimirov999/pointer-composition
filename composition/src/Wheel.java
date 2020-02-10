public class Wheel {
    private double pressure;

    public Wheel() {
    }
    public double getPressure() {
        return this.pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public void pump() {
        this.pressure = 2.4000000953674316D;
    }

    @Override
    public String toString() {
        return "pressure=" + pressure;
    }
}
