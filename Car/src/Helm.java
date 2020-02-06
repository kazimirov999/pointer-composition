public class Helm {
private int Diameter;
private String Material;

    public int getDiameter() {
        return Diameter;
    }

    public void setDiameter(int diameter) {
        Diameter = diameter;
    }

    public String getColor() {
        return Material;
    }

    public void setMaterial(String material) {
        Material = material;

    }

    public Helm(int diameter, String material) {
        Diameter = diameter;
        Material = material;
    }

    public void HelmDisplay(){
        System.out.println("Диаметр Руля "+ Diameter +" Матеріал з якого віготовлений руль " + Material);
    }



}
