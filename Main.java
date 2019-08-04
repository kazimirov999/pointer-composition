import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Car car = new Car(new Body("BLACk"), new SteeringWheel(new Chassis(new Wheel[]{new Wheel(2.0f),
                new Wheel(2.0f)}, new Wheel[]{new Wheel(2.0f), new Wheel(2.0f)})), new Engine(2.5f,
                10, 100, 50.0f));


        car.paint("WHITE");
        car.start();
        car.drive(10);
        car.turn(Direction.LEFT);
        car.stop();


    }
}
