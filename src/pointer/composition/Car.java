package pointer.composition;

public class Car {
    private SteeringWheel steeringWheel = new SteeringWheel();
    private Engine engine = new Engine(2.0f, 120);
    private Wheel[] wheels;
    private Body body;

    public Car(Color carColor, Wheel[] wheels) {
        this.body = new Body(carColor);
        this.wheels = wheels;
        repair();
    }

    public Color getCarColor() {
        return body.getColor();
    }

    public Wheel[] getWheels() {
        return wheels;
    }

    public void changeWheel(int index, Wheel wheel) {
        wheels[index] = wheel;
    }

    public void ingine() {
        engine.start();
    }

    public void turn(Direction direction) {
        steeringWheel.turn(direction);
    }

    public void repair() {
        body.clean();

        for (Wheel wheel : wheels) {
            wheel.pump();
        }
    }
}
