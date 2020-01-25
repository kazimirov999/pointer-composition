package poinrer.javacore.com;

public class Main {

    public static void main(String[] args) {
        Car car = new Car();
        Wheel wheel = new Wheel();
        Helm helm = new Helm();
        Body body = new Body();

        body.avto("BMV", 2000);
        body.getColor();
        body.setBodyType("Универсал");
        body.setBodyWork("лужонна");
        helm.getWidth();
        helm.text();
        wheel.setMaterial("покритий матеріалом з кожі");
        wheel.setKnittingNeedles(3);
        wheel.setColor("Колір руля чорний");
        System.out.println("---------------------");
        helm.size("Volvo", 15);
        helm.drive("Stop");

        car.names= "ggg";

    }
}
