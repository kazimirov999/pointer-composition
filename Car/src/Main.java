public class Main {
    public static void main(String[] args) {

        Car car = new Car();
        car.body = new Body(" Бус "," Білий ");
        car.Mark = " Mercedes ";
        car.helm = new Helm(20," Шкіра ");
        car.wheels = new Wheels(17," Bridgestone ",2);
        car.CarMarkDisplay();
        car.body.BodyDisplay();
        car.helm.HelmDisplay();
        car.wheels.WheelsDisplay();

        }
    }

