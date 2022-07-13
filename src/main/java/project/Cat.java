package project;

public class Cat {
    private String color;
    private int lapkiNumber;
    private int eyeNumber;


    public String getColor() {
        return color;
    }

    public int getLapkiNumber() {
        return lapkiNumber;
    }

    public int getEyeNumber() {
        return eyeNumber;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setLapkiNumber(int lapkiNumber) {
        this.lapkiNumber = lapkiNumber;
    }

    public void setEyeNumber(int eyeNumber) {
        this.eyeNumber = eyeNumber;
    }

    @Override
    public String toString() {
        return "[lapki: " + lapkiNumber + "|" + color +"|" + "eye:" + eyeNumber + "]";
    }


}
