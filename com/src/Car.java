package src;

import static java.lang.System.*;

public class Car {
    private String brand;
    private String color;
    private int memberofpassengers;

    void stockekip(String brand, String color, int memberofpassengers) {
        this.brand = brand;
        this.color = color;
        this.memberofpassengers = memberofpassengers;

    }

    public String toString() {
        return brand + "  " + color + " " + memberofpassengers + "passengers";

    }

    Car() {
        Wheel wheel = new Wheel();
        Body body = new Body();
        SteeringWheels steeringWheels = new SteeringWheels();
        body.setBody("Bus");
        wheel.setRadius(25);
        wheel.setPressure(4.4f);
        steeringWheels.setDegrees(10);

        wheel.pump();
        body.type();
        steeringWheels.direction();

    }
}