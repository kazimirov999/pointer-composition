package pointer.composition;

public class SteeringWheel {
    private float position;

    public void turn(Direction direction) {
        position += direction.getDegree();
        System.out.println("Sterring wheel position: " + position);
    }
}
