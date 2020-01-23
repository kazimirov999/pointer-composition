public class Body {
    private String Color;

    public Body(String color) {
        Color = color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public String getColor() {
        return Color;
    }
    public void ColorDisplay(){
        System.out.println("Цвет вашего авто = " + Color);
    }
}
