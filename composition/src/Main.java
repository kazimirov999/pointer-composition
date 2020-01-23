public class Main {
    public static void main(String[] args) {

        Car skoda = new Car(280, 1598);

        skoda.playMusik(10);
        skoda.heatingOn();
        skoda.volumeUp(5);
        skoda.volumeDown(1);
        skoda.heatingOff();
        skoda.stopMusik();
        skoda.setPressure(2.2);

        System.out.println(skoda.toString());
    }

}


// -----------------------------------------------------------------
//        Пiдiгрiв керма вимкнений
//        Музика вимкнена
//        У вас встановленi диски 17-го діаметру
//        Шини накачаннi до тиску 2.2 атм
//        Колiр вашої машини - червоний
//        Тип кузова - ліфтбек