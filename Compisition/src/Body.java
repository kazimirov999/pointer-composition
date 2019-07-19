public class Body {
    private String body;
    private String color;

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    void type() {
        System.out.println("Тип кузова " + getBody() + " та колір " + getColor());
    }


}
