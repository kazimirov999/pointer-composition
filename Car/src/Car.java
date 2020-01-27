public class Car {
     String Mark;
    Body body;
 Helm helm;
     Wheel wheel;

    public Car() {
        this.body = new Body("Бус "," Білий");
        this.helm = new Helm( 20," дерево");
        this.wheel = new Wheel(16," Bridgestone");
        this.Mark = " Mercedes ";

    }



    public void CarMarkDisplay(){
        System.out.println("Марка машини " + Mark);
    }
}
