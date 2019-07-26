public class Car {
    SteeringWheel steeringWheel;
    Wheel wheels;
    Body body;
    Engine engine;

    Car(float fuelVolume, float power, String color, float position) {
        this.engine = new Engine(fuelVolume, power);
        this.body = new Body(color);
        this.steeringWheel = new SteeringWheel(position);
    }

    Car() {
        this.engine = new Engine(0, 100);
        this.body = new Body("Black");
        this.steeringWheel = new SteeringWheel(90);
        this.wheels = new Wheel(2.3f);
    }

    void start() {
        engine.engage();
    }
}
