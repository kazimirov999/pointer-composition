package src;

public class Wheel implements Wheels {
    private int radius;
    private float pressure;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

     @Override
     public void pump() {
        if (radius >22 & pressure >= 3.5f) {
            System.out.println(" Wheels are prepared for road! Preassure is: " + getPressure() + " Radius: " + getRadius());
        }
        if (radius < 12) {
            System.out.println(" Need bigger wheels");
        }
        if (pressure < 3.5f) {
            System.out.println("Pump wheels to 3.5!");
        }
    }
}
