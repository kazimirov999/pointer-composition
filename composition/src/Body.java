public class Body {
    private String body;
    private String color;

    public Body(String body, String color) {
        this.body = body;
        this.color = color;
    }

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

    @Override
    public String toString() {
        return "body='" + body + " color='" + color;
    }
}
