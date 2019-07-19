public class Car {
    private String cruise;
    private String seatHeat;
    private String typeFuel;

    void Baza(String cruise, String seatHeat, String typeFuel) {
        this.cruise = cruise;
        this.seatHeat = seatHeat;
        this.typeFuel = typeFuel;
    }

    public Car(String cruise, String seatHeat, String typeFuel) {
        this.cruise = cruise;
        this.seatHeat = seatHeat;
        this.typeFuel = typeFuel;
    }


    public String toString() {
        return "Тип круїза: " + cruise + " Підігрів сидінь: " + seatHeat + " Тип палива: " + typeFuel;


    }

    Car() {
        Body body = new Body();
        Wheel wheel = new Wheel();
        Helm helm = new Helm();
        body.setBody("Купе");
        body.setColor("Пурпур");
        helm.getMater("Велюр");
        helm.getQuality(9);
        wheel.getPressure();
        wheel.pump();
        body.type();
        helm.displayHelm();
        wheel.displayPress();


    }
}



