package project.food;

import project.cats.Cat;
import project.cats.Sex;

public class Food {
    private final String brand;

    public Food(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void eat(Cat cat) {
        StringBuilder builder = new StringBuilder();
        boolean isMale = cat.getSex().equals(Sex.MALE);

        if (isMale) {
            builder.append("Кот");
        } else {
            builder.append("Кошка");
        }
        builder.append(" по имени ")
                .append(cat.getName());

        if (isMale) {
            builder.append(" съел");
        } else {
            builder.append(" съела ");
        }
        builder.append(" корм фирмы ")
                .append(getBrand());
        System.out.println(builder);
    }
}