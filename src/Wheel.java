public class Wheel {
    private float pressure;

    Wheel(float pressure) {
        this.pressure = pressure;
    }

    void pump(float pressure) {
        this.pressure += pressure;
        System.out.println("Pumping your wheels for " + pressure + "\n" +
                "Now pressure is " + this.pressure);
    }

}
