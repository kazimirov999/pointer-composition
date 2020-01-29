public class WheelWithTire {
    private int pressure;
    private String color;
    private int diameter;
    private String treadType;

    public WheelWithTire(int pressure, String color, int diameter, String treadType) {
        this.pressure = pressure;
        this.color = color;
        this.diameter = diameter;
        this.treadType = treadType;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public String getTreadType() {
        return treadType;
    }

    public void setTreadType(String treadType) {
        this.treadType = treadType;
    }

    public void inflate(int bypounds) {
        this.pressure = bypounds;
    }
}
