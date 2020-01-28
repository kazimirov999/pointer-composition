package src;

public class Body implements  Type{
    private String body;

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
     @Override
     public void type() {
        System.out.println("Body type is:  " + getBody());
    }
}
