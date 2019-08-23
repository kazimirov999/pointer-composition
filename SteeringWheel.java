class SteeringWheel {

    private float position;

    private float getPosition() {
        return position;
    }

    void setPosition(float position1) {
        position = position1;

    }

    void direction() {
        System.out.println(" Steering wheel rotated " + getPosition() + " degrees ");
    }


}