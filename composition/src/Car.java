public class Car {

    private int maxSpeed;
    private int motorVolume;

    private Body cabina;
    private Wheel tire;
    private SteeringWheel baranka;

    public Car(int maxSpeed, int motorVolume) {
        this.maxSpeed = maxSpeed;
        this.motorVolume = motorVolume;
        this.cabina = new Body("червоний", "ліфтбек");
        this.tire = new Wheel(17, 2.0);
        ;
        this.baranka = new SteeringWheel();
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMotorVolume() {
        return motorVolume;
    }

    public void setMotorVolume(int motorVolume) {
        this.motorVolume = motorVolume;
    }

    public String getColor() {
        return cabina.getColor();
    }

    public void setColor(String color) {
        this.cabina.setColor(color);
    }

    public String getBodyType() {
        return cabina.getBodyType();
    }

    public void setBodyType(String bodyType) {
        this.cabina.setBodyType(bodyType);
    }

    public int getDiameter() {
        return tire.getDiameter();
    }

    public void setDiameter(int diameter) {
        this.tire.setDiameter(diameter);
    }

    public double getPressure() {
        return tire.getPressure();
    }

    public void setPressure(double pressure) {
        this.tire.setPressure(pressure);
    }

    public boolean isHeating() {
        return baranka.isHeating();
    }

    public void heatingOn() {
        this.baranka.heatingOn();
    }

    public void heatingOff() {
        this.baranka.heatingOff();
    }

    public void playMusik(int volume) {
        this.baranka.playMusik(volume);
    }

    public void stopMusik() {
        this.baranka.stopMusik();
    }

    public int getVolume() {
        return baranka.getVolume();
    }

    public void volumeUp(int volume) {
        this.baranka.volumeUp(volume);
    }

    public void volumeDown(int volume) {
        this.baranka.volumeDown(volume);
    }

    @Override
    public String toString() {
        return baranka.toString() + tire.toString() + cabina.toString();
    }
}
