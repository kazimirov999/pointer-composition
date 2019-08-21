class Body {
    private static String typeBody;

    private static String getTypeBody() {
        return typeBody;
    }

    void setTypeBody(String typeBody1) {
        typeBody = typeBody1;
    }

    void type() {
        System.out.println(" Body type is: " + getTypeBody());
    }


}
