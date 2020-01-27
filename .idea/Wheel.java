public class Wheel {

    private int diameter;

    public Wheel(int diameter){
        this.diameter = diameter;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return " Діаметр вашого диску, становить -> " + diameter ;
    }
}

