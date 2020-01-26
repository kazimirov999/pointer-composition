package poinrer.javacore.com;

public class Wheel extends Car {
    private String material;
    private String color;
    private int knittingNeedles = 3;
    private String str = new String("Руль в чудовому стані");

    public Wheel(){
    }

    public void setMaterial(String material){
        String mat = material;
        System.out.println(str.toString());
        System.out.println(mat);
        return;
    }

    public int setKnittingNeedles(int b){
       int a = b;
        a = 3;
        String t = "руль з ";
        System.out.println(t);
        return a;
    }

    public void setColor(String color){
        String col = color;
        System.out.println(col);
    }

}
