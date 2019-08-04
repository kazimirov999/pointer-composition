public class SteeringWheel {

    public Chassis chassis;
    private float position;

    public SteeringWheel(Chassis chassis) {
        this.chassis = chassis;
    }

    public void turn(Direction direction) {
        position += direction.getDegree();
        System.out.println("Sterring wheel position: " + position);
        chassis.turn(direction.name());
    }

    public float getPosition() {
        return position;
    }

    public void setPosition(float position) {
        this.position = position;
    }
}
