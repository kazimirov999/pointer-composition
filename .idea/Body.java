public class Body {
    private String BodyStyle;

    public Body(String bodyStyle){
        BodyStyle = bodyStyle;
    }

    public  void setBodyStyle(String bodyStyle){
        BodyStyle = bodyStyle;
    }

    public  String getBodyStyle(){
        return BodyStyle;
    }

    public void BodyStyleDisplay(){
        System.out.println("Ваш стиль, кузова = " + BodyStyle);
    }
}
