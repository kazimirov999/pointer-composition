public class Car {

    private int maximumAcceleration;
    private int engineSpeed;

    private Body bodyCar;
    private Wheel wheelCar;
    private SteeringWheel steeringWheelCar;

    public Car(int maximumAcceleration, int engineSpeed){
        this.maximumAcceleration = maximumAcceleration;
        this.engineSpeed = engineSpeed;
        bodyCar = new Body("Sport", "Red");
        wheelCar = new Wheel(20);
        steeringWheelCar = new SteeringWheel("Righ or Left", 90);
    }

    public int getMaximumAcceleration() {
        return maximumAcceleration;
    }

    public void setMaximumAcceleration(int maximumAcceleration) {
        this.maximumAcceleration = maximumAcceleration;
    }

    public int getEngineSpeed() {
        return engineSpeed;
    }

    public void setEngineSpeed(int engineSpeed) {
        this.engineSpeed = engineSpeed;
    }

    public Body getBodyCar() {
        return bodyCar;
    }

    public Wheel getWheelCar() {
        return wheelCar;
    }

    public SteeringWheel getSteeringWheelCar() {
        return steeringWheelCar;
    }

    @Override
    public String toString() {
        return bodyCar.toString() + wheelCar.toString() +
                steeringWheelCar.toString() + "Ваша максимальна швидкість ->"
                + maximumAcceleration + "Обороти двигуна становлять -> " + engineSpeed;
    }
}