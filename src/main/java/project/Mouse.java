package project;

public class Mouse {
    private  String name;
    public Mouse(String name){
        this.name = name;
    }


    public String getName() {
        return name;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void kill(Cat cat) {
        System.out.println("Мышь по имени " + getName() + " убита кошкой по имени "+cat.getName());
    }

}