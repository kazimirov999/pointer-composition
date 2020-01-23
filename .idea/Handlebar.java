public class Handlebar {
    private int HandlebarRadius;
    private String HandlebarToLeft;
    private String HandlebarToRight;

    public Handlebar(int handlebarRadius){
        HandlebarRadius = handlebarRadius;
    }

    public int getHandlebarRadius() {
        return HandlebarRadius;
    }

    public void setHandlebarRadius(int handlebarRadius) {
        HandlebarRadius = handlebarRadius;
    }

    public String getHandlebarToLeft() {
        return HandlebarToLeft;
    }

    public void setHandlebarToLeft(String handlebarToLeft) {
        HandlebarToLeft = handlebarToLeft;
    }

    public String getHandlebarToRight() {
        return HandlebarToRight;
    }

    public void setHandlebarToRight(String handlebarToRight) {
        HandlebarToRight = handlebarToRight;
    }

    public void HandlebarRadiusDisplay(){
        System.out.println("Радіус керма = " + getHandlebarRadius());
    }
}
