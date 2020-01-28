public class Car {

    Body body = new Body(Color.BLUE);
    SteeringWheel steeringWheel = new SteeringWheel(6,5);
    Wheel wheel = new Wheel(15);

    public void engine(){
        System.out.println("Авто завелося.");
        }

    public void engineOff(){
        System.out.println("Авто заглушилося.");
    }
}
