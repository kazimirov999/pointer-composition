/*Створити клас Кермо, Колесо, Кузов – описати дані класи(гетери, сетери, туСтрінг, конструктор). Додати методи які б
        виконували певні функції з полями (наприклад збільшення діаметру колеса). Створити клас Машина, який матиме
        деякі свої поля та об’єкти класу Кермо, Кузов, Колесо як поля класу. «Обгорнути» функціональні методи композиційних
        класів в класі Машина. В мейн методі створити клас Машина, запустити всі його методи.*/

public class Main {
    public static void main(String[] args) {
        Car car = new Car(Color.BLUE, new Wheel[]{new Wheel(5.2f),
                                                   new Wheel(5.2f),
                                                   new Wheel(5.0f),
                                                   new Wheel(5.2f)
        });
        //Car car = new Car(); //test sample

        System.out.println("Потужність двигуна: " +car.engine.getPower() + ", об'єм двигуна: " + car.engine.getVolume() + ", колір авто: " + car.body.getColor());
        car.ingine();
        System.out.println("Потужність двигуна: " +car.engine.getPower() + ", об'єм двигуна: " + car.engine.getVolume() + ", колір авто: " + car.body.getColor());
    }
}
