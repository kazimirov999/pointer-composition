package src;

public class Body {
    private String body;

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    void type() {
        System.out.println("Body type is:  " + getBody());
    }
}
