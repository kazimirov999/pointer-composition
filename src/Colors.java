public enum Colors {
    RED("Red"),
    BLACK("Black"),
    GREEN("Green"),
    BLUE("Blue"),
    WHITE("White");

    private String color;

    Colors(String color) {
        this.color = color;
    }

    public String toString() {
        return color;
    }
}
