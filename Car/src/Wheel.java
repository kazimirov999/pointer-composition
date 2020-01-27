public class Wheel {
    private int Radius;
    private String Brand;


    public int getRadius() {
        return Radius;
    }

    public void setRadius(int radius) {
        Radius = radius;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public Wheel(int radius, String brand) {
        Radius = radius;
        Brand = brand;
    }

    @Override
    public String toString() {
        if (Radius == 15)
        return "Radius " + Radius + " Michelin";
        else
            return "Radius "+ Radius + Brand;
    }
    public void WheelDisplay(){
        System.out.println("Радіус колеса " + Radius + " Виробник " + Brand);
    }
}
