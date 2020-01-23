public class Car {
    private String MakeAndModel = "Tesla Model X";
    Wheel wheel;
    Body body;
    Handlebar handlebar;

    public Car(){
        wheel = new Wheel(100);
        body = new Body("Sport");
        handlebar = new Handlebar(360);
    }

    public String getMakeAndModel() {
        return MakeAndModel;
    }

    public void setMakeAndModel(String makeAndModel) {
        MakeAndModel = makeAndModel;
    }

    public void CarMakeAndModelDisplay(){
        System.out.println("Марка та Модель ->" + getMakeAndModel());
    }
}
