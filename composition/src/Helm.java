

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

    public Helm(int quality, String mater) {
        this.quality = quality;
        this.mater = mater;
    }

    @Override
    public String toString() {
        return "quality=" + quality + "mater=" + mater;
    }

    public int getQuality() {
        return quality;
    }

    public String getMater() {
        return mater;
    }
}
