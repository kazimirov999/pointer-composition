public class SteeringWheel {
    private String turnRighOrLeft;
    private int maxWhellRadius;

    public SteeringWheel(String turnRighOrLeft, int maxWhellRadius){
        this.turnRighOrLeft = turnRighOrLeft;
        this.maxWhellRadius = maxWhellRadius;
    }
    public String getTurnRighOrLeft() {
        return turnRighOrLeft;
    }

    public void setTurnRighOrLeft(String turnRighOrLeft) {
        this.turnRighOrLeft = turnRighOrLeft;
    }

    public int getMaxWhellRadius(){
        return maxWhellRadius;
    }
    public void setMaxWhellRadius(){
        this.maxWhellRadius = maxWhellRadius;
    }

    @Override
    public String toString() {
        return " Ви здійснили поворот -> " + turnRighOrLeft
                + "Радіус вашого повороту ->" + maxWhellRadius;
    }
}



