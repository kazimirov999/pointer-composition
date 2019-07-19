import java.sql.SQLOutput;

public class main {
    public static void main(String[] args) {
        Car Honda = new Car();
        Honda.Baza("Адаптивний", "Включений", "Diesel");
        System.out.println(Honda.toString());
    }


}
