package poinrer.javacore.com;

public class Helm extends Car {
    private int diameter;
    private int width, height;
    private String rubberTires = new String("резина низькопрофільна");

    public Helm(){
    }

    public void setDiameter(int d) {
        System.out.println("R" + d);
    }

    public void getWidth(){
        width = 75;
        height = 180;
        System.out.print("Колеса " + width + "/" + height + ", ");
        setDiameter(23);
    }

    public void text(){
        System.out.println(rubberTires.toString());
    }
}


