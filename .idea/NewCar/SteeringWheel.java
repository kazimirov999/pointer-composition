package NewCar;

public class SteeringWheel {
    public int left;
    public int right;

    public SteeringWheel(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public int getLeft() {
        return left;
    }

    public void setLeft(int left) {
        this.left = left;
    }

    public int getRight() {
        return right;
    }

    public void setRight(int right) {
        this.right = right;
    }

    public void turn(){
        if (left == 0){
            System.out.println("Здійснили поворот ліворуч");
        }
        else if (right == 1){
            System.out.println("Здійснили поворот праворуч");
        }
    }
}
