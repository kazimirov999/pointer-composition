import java.util.Scanner;

public class Body {

    private Color color;

    public Body(Color color) {
        this.color = color;
    }
    public Body() {
        this.color = Color.BLACK;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Body{" +
                "color=" + color +
                '}';
    }

    void clean(){

        System.out.println("Список кольорів для авто: \n");
        for (Color color : Color.values()){
            System.out.print(color + " ");
        }

        System.out.println();

        String i = null;
        boolean entered = true;

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Введіть колір авто: ");
            if (scanner.hasNextLine()) {
                i = scanner.nextLine();
                entered = false;
            } else
                scanner.next();
        } while (entered);

        System.out.println("Ваш новий колір авто після перефарбування: " + Color.valueOf(i));
        color = Color.valueOf(i);
    }

}
