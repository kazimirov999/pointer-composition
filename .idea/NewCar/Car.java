package NewCar;

import java.util.Arrays;

public class Car {

    private String color;
    private String make;
    private String style;
    private WheelWithTire[] wheelWithTires;

    public Car(String color, String make, String style, WheelWithTire [] wheelWithTires) {
        super();
        this.color = color;
        this.style = style;
        this.make = make;
        this.wheelWithTires = wheelWithTires;

    }

    public boolean start(){

        boolean success = true;
        for (int i=0; i<wheelWithTires.length; i++){
            if(wheelWithTires[i].getPressure() <32){
                System.out.println("Шина # " + i  +  "Дуже мало тиску, щоб розпочати рух" );
                success = false;
            }
        }
        return success;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public WheelWithTire[] getTires() {
        return wheelWithTires;
    }

    public void setTires(WheelWithTire[] tires) {
        this.wheelWithTires = tires;
    }

    @Override
    public String toString() {
        return  "Чорна" + color + '\'' +
                " BMW" + make + '\'' +
                "Універсал" + style + '\'' +
                "4 колеса з шимами" + Arrays.toString(wheelWithTires);
    }
}










































