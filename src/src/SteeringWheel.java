public class SteeringWheel {

    public int left;
    public int right;

    public SteeringWheel(int left, int right) {
        this.left = left;
        this.right = right;
    }
    public void turn(){
        if (left == 0){
            System.out.println("Ви повернули наліво.");
        }
        else if (right == 1){
            System.out.println("Ви повернули направо");
        }
        else {
            try {
                throw new Throwable("Все дуже погано.");
            } catch (Throwable throwable) {
                throwable.printStackTrace();
            }
        }
        }
    }

