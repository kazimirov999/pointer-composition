public class Car {
    private Body body;
    private SteeringWheel steeringWheel;
    private Engine engine;
    private double milage;

    public Car(Body body, SteeringWheel steeringWheel, Engine engine) {
        this.body = body;
        this.steeringWheel = steeringWheel;
        this.engine = engine;
        this.milage = 0;
    }

    void start() {
        engine.ignite();
    }

    void stop() {
        engine.stop();
    }

    void paint(String paint) {
        body.repaint(paint);
    }

    void changeFrontWheel(int index, Wheel wheel) {
        steeringWheel.chassis.changeFrontWheel(index, wheel);
    }

    void changeBackWheel(int index, Wheel wheel) {
        steeringWheel.chassis.changeBackWheel(index, wheel);
    }

    void drive(float km) {
        engine.work(km);
        milage += engine.milageFromEngine;
        System.out.println("Milage: " + milage);
    }

    void turn(Direction direction) {
        steeringWheel.turn(direction);
    }


    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public SteeringWheel getSteeringWheel() {
        return steeringWheel;
    }

    public void setSteeringWheel(SteeringWheel steeringWheel) {
        this.steeringWheel = steeringWheel;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
