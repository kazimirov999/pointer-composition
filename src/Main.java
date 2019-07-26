public class Main {

    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.engine.reFuel(20);
        car.body.clean();
        car.wheels.pump(0);
        car.start();
        car.steeringWheel.turn(50);
    }
}
