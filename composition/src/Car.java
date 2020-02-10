
public class Car {
    private String cruise;
    private String seatHeat;
    private String typeFuel;
    Body body;
    Helm helm;
    Wheel wheel;


    public Car(String cruise, String seatHeat, String typeFuel) {
        this.cruise = cruise;
        this.seatHeat = seatHeat;
        this.typeFuel = typeFuel;
        this.body = new Body("Купе", "чорний");
        this.helm = new Helm(4, "Шкіра");
        this.wheel = new Wheel();
    }

    public Car() {
        this.cruise = "адаптивний";
        this.seatHeat = "Вимкнений";
        this.typeFuel = "Дизель";
        this.body = new Body("Купе", "чорний");
        this.helm = new Helm(4, "Шкіра");
        this.wheel = new Wheel();
    }

    public String toString() {
        return wheel.toString()
                + "Тип круїза: " + cruise
                + " Підігрів сидінь: " + seatHeat
                + " Тип палива: " + typeFuel
                + helm.toString()
                + body.toString();


    }



}



