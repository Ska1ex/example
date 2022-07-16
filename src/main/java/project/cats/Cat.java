package project.cats;

import java.time.LocalDate;

public class Cat {
    private String color;

    private Sex sex;
    private int lapkiNumber;
    private int eyeNumber;

    private String name;

    private LocalDate createdAt = LocalDate.now();

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

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
