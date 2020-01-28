package src;

public class Truck implements Cars {
    private String brand;
    private String color;
    private int memberofpassengers;
    private String materialofhelmet;
    private String typeofwheels;
    private String typeofgearbox;
    private String typeoffuel;

    @Override
    public void stockekip(String brand, String color, int memberofpassengers, String materialofhelmet) {
        this.brand = brand;
        this.color = color;
        this.memberofpassengers = memberofpassengers;
        this.materialofhelmet = materialofhelmet;

    }

    @Override
    public void specialekip(String typeofwheels, String typeofgearbox, String typeoffuel) {
        this.typeofwheels = typeofwheels;
        this.typeofgearbox = typeofgearbox;
        this.typeoffuel = typeoffuel;

    }


    public String toString() {
        return brand + "  " + color + " " + memberofpassengers + "passengers" + " " + materialofhelmet + " " + " material of helmet" + typeofwheels + " " + " type of tyres " + typeofgearbox + " " + " type of gearbox " + typeoffuel + " " + " type of fuel ";

    }

    public Truck() {
        Wheel wheel = new Wheel();
        Body body = new Body();
        SteeringWheels steeringWheels = new SteeringWheels();
        body.setBody("Lorry");
        wheel.setRadius(25);
        wheel.setPressure(3.5f);
        steeringWheels.setDegrees(0);

        wheel.pump();
        body.type();
        steeringWheels.direction();

    }

}
