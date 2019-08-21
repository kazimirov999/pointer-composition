
public class Car {

    private String brand;
    private String color;


    Car() {
        Wheel wheel = new Wheel();
        Body body = new Body();
        SteeringWheel steeringWheel = new SteeringWheel();
        body.setTypeBody("Wagon");
        wheel.setDiametr(15);
        wheel.setPressure(2.5f);
        steeringWheel.setPosition(25.2f);


        wheel.pump();
        steeringWheel.direction();
        body.type();
    }

    void appearance(String brand, String color) {
        this.brand = brand;
        this.color = color;

    }

    public String toString() {
        return " Brand is : " + brand + ", color is : " + color;
    }


}






