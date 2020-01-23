public class SteeringWheel {
    private String SteeringWheelLeft = "Left";
    private String SteeringWheelRight = "Right";
    private int SteeringWheelRadius;

    public SteeringWheel(int steeringWheelRadius) {
        SteeringWheelRadius = steeringWheelRadius;
    }

    public String getSteeringWheelLeft() {
        return SteeringWheelLeft;
    }

    public void setSteeringWheelLeft(String steeringWheelLeft) {
        SteeringWheelLeft = steeringWheelLeft;
    }

    public String getSteeringWheelRight() {
        return SteeringWheelRight;
    }

    public void setSteeringWheelRight(String steeringWheelRight) {
        SteeringWheelRight = steeringWheelRight;
    }

    public int getSteeringWheelRadius() {
        return SteeringWheelRadius;
    }

    public void setSteeringWheelRadius(int steeringWheelRadius) {
        SteeringWheelRadius = steeringWheelRadius;
    }

    public void SteeringWheelDisplay() {
        System.out.println("Радиус руля = " + getSteeringWheelRadius());
    }
}
