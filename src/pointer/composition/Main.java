package pointer.composition;

public class Main {

    public static void main(String[] args) {
	    Car car = new Car(Color.RED, new Wheel[] { new Wheel(), new Wheel(), new Wheel(), new Wheel()});
	    Direction[] road = new Direction[] {Direction.LEFT, Direction.RIGHT, Direction.RIGHT, Direction.LEFT, Direction.LEFT};

	    for (Direction direction : road) {
			car.ingine();
			car.turn(direction);
		}

	    car.ingine();

	    car.changeWheel(1, new Wheel());
	    car.repair();

		System.out.print("Your car has " + car.getCarColor().name().toLowerCase() + " color and pressure in wheels: ");

		for (int i = 0; i < (car.getWheels().length - 1); i++) {
			System.out.print(("wheel " + i + " has pressure " + car.getWheels()[i].getPressure() + ", "));
		}

		System.out.println(("wheel " + (car.getWheels().length - 1) + " has pressure " + car.getWheels()[car.getWheels().length - 1].getPressure() + "."));
    }
}
