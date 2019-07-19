

public class Helm {
    private int quality; // якість шкіряного покрову від 1 до 100
    private String mater;// з якого матеріалу зроблено кермо

    public int getQuality(int quality) {
        return quality;
    }

    public String getMater(String mater) {
        return mater;
    }

    public void setMater(String mater) {
        this.mater = mater;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }


    void displayHelm() {
        System.out.println("Якість керма по 10 бальній шкалі:" + getQuality(9) + " Та його виконання з: " + getMater("Велюр"));
    }
}
