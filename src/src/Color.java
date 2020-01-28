public enum Color {
    GREEN("GREEN"),
    BLUE("BLUE");

    private String color;

    Color(String color) {
        this.color = color;
    }

    public String toString(){
        return color;
    }
}
