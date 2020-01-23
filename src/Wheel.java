public class Wheel {
    private int [] wheels = new int[4];
    private int wheelRadius;

    public Wheel(int wheelRadius) {
        this.wheelRadius = wheelRadius;
    }

    public int[] getWheels() {
        return wheels;
    }

    public void setWheels(int[] wheels) {
        this.wheels = wheels;
    }

    public int getWheelRadius() {
        return wheelRadius;
    }

    public void setWheelRadius(int wheelRadius) {
        this.wheelRadius = wheelRadius;
    }

    public void setWheelsRadius(){
        wheels [0] = wheelRadius;
        wheels [1] = wheelRadius;
        wheels [2] = wheelRadius;
        wheels [3] = wheelRadius;
    }
    public void wheelDisplay(){
        for (int i = 0; i < wheels.length; i++){
            System.out.println("Радиус колеса = " + wheelRadius);
        }
    }
}
