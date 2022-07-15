package project.food;

import project.cats.Cat;

public class Food {
    private final String brand;

    public Food(String brand) {
        this.brand = brand;
    }
    public String getBrand() {
        return brand;
    }
    public void eat(Cat cat) {
        System.out.println("Кот по имени " + cat.getName() + " съел корм фирмы " + getBrand());
    }

}
