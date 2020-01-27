package src;

public class SteeringWheels {
    private int degrees;

    public int getDegrees() {
        return degrees;
    }

    public void setDegrees(int degrees) {
        this.degrees = degrees;
    }

    void direction() {
        System.out.println(" Steering wheels is:" + getDegrees() + " degrees");
    }
}
