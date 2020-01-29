package NewCar;

public class Main {
    public static void main(String[] args) {

        WheelWithTire t1 = new WheelWithTire(0, "black", 20, "symmetrical");
        WheelWithTire t2 = new WheelWithTire(0, "red", 20, "symmetrical");
        WheelWithTire t3 = new WheelWithTire(0, "while", 20, "symmetrical");
        WheelWithTire t4 = new WheelWithTire(0, "pink", 20, "symmetrical");

        t1.inflate(100);
        t2.inflate(100);
        t3.inflate(100);
        t4.inflate(100);

        WheelWithTire[] tires = {t1,t2,t3,t4};

        Car supercar = new Car("Black","BMW","station wagon",tires);

        boolean started = false;

        started = supercar.start();
        if(started == true){
            System.out.println("Машина завелася і поїхала!");
        }
        else {
            System.out.println("Машина не завелася!");
        }
    }
}



