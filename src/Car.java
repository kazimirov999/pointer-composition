public class Car {
    private String Mark = "Lamborghini";
    private String Model = "Diablo";
    SteeringWheel steeringWheel;
    Wheel wheel;
    Body body;

    Car(){
        this.steeringWheel = new SteeringWheel(32);
        this.wheel = new Wheel(21);
        this.body = new Body("Black");
    }

    public String getMark() {
        return Mark;
    }

    public void setMark(String mark) {
        Mark = mark;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }
    public void CarModelMarkDisplay(){
        System.out.println("Марка ато: " + getMark());
        System.out.println("Модель ато: " + getModel());
    }
}
