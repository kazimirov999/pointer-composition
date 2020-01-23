package poinrer.javacore.com;

public class Body extends Car {
    private String bodyWork;
    private String color;
    private String bodyType;

    public Body() {

    }

    public void setBodyWork(String tp) {
        String text = tp;
        if (text == "лужонна") {
            System.out.println("Автомобіль лужонний");
        } else if (text == "Оцинкований") {
            System.out.println("Автомобіль оцинкований");
        }
    }

    public void getColor() {
        String c = this.color;
        c = "Червоний";
        System.out.println("Колір - " + c);
    }

    public void setBodyType(String txt) {
        System.out.println("Тип кузова - " + txt);
    }
}
