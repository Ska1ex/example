package project;

public class Cat {
    private String color;
    private int lapkiNumber;
    private int eyeNumber;

    private String name;

    public String getName(){
        return name;}

    public void setName(String name) {
        this.name = name;
    }



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
