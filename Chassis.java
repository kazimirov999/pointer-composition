public class Chassis {
    private Wheel[] frontWheels;
    private Wheel[] backWheels;


    public Chassis(Wheel[] frontWheels, Wheel[] backWheels) {
        this.frontWheels = frontWheels;
        this.backWheels = backWheels;
    }

    void turn(String dir) {
        System.out.println("Front wheels turning " + dir);
    }

    void changeFrontWheel(int index, Wheel wheel) {
        frontWheels[index] = wheel;
    }

    void changeBackWheel(int index, Wheel wheel) {
        backWheels[index] = wheel;
    }

    public Wheel[] getFrontWheels() {
        return frontWheels;
    }

    public void setFrontWheels(Wheel[] frontWheels) {
        this.frontWheels = frontWheels;
    }

    public Wheel[] getBackWheels() {
        return backWheels;
    }

    public void setBackWheels(Wheel[] backWheels) {
        this.backWheels = backWheels;
    }
}
