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

    public void size(String nCar, int d){
        String car = nCar;
        int diameter = d;
        switch (car){
            case "Audi":
                if (diameter >=13 && diameter <=16) {
                 System.out.println(diameter +=2);
                }else{
                    System.out.println(diameter+=5);
                    break;
                }
            case "Volvo":
                if (diameter >=13 && diameter <=16) {
                    diameter += 5;
                 System.out.println(diameter);
                }else {
                    System.out.println(diameter +=10);
                    break;
                }
        }
    }

    public void drive(String drive){
        String d = drive;
        if (d == "Start"){
            System.out.println("двигун запущено, можна їхати");
        }else if (d == "Stop"){
            System.out.println("двигун виключено. Уже ныхто нікуда не їде)))");
        }
    }
}


