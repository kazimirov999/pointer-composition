public class Body {
    private String bodyStyle;
    private String color;

    public Body(String bodyStyle, String color){
        this.bodyStyle = bodyStyle;
        this.color = color;
    }

    public String getBodyStyle() {
        return bodyStyle;
    }

    public void setBodyStyle(String bodyStyle) {
        this.bodyStyle = bodyStyle;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Стиль вашої машина ->" + bodyStyle
                + " Колір вашої машини ->" + color;
    }
}
