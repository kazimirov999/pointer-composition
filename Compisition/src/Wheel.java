public class Wheel {
    private double pressure;

    public double getPressure() {

        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public void pump() {
        pressure = 2.4f;
    }

    void displayPress() {
        System.out.println("Тиск у шинах: " + getPressure());
    }

}