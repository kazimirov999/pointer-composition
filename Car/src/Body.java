public class Body {
    public String Tape,Color;

    public Body(String tape, String color) {
        Tape = tape;
        Color = color;
    }
    public void BodyDisplay(){
        System.out.println("Тип кузова "+ Tape + "Колір " + Color);
    }

}
