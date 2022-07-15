package project.cats;

public class MainCat extends Cat{

    public MainCat(){
        setEyeNumber(4);
    }

    @Override
    public String toString() {
        String name = "str";

        return "МэйнКун: color: " + getColor() + "| eye: " + getEyeNumber() + "| lapki: " + getLapkiNumber();
    }
}
