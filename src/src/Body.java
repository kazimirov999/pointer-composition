public class Body {

    Color color;

    public Body(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void paint(){
        System.out.println("Ваше авто " + getColor() + " кольору.");

    }

}
