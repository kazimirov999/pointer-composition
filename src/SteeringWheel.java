public class SteeringWheel {
    private float position;

    SteeringWheel(float position) {
        this.position = position;
    }

    void turn(float angle) {
        this.position += angle;

        System.out.println("You're turning for " + angle + " angles\n" +
                "Your steering wheel's position is at " + position + " angles now");
    }
}


