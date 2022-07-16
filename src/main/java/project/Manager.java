package project;

import project.animals.Mouse;
import project.cats.Cat;
import project.cats.Sex;
import project.food.DryFood;

import java.util.ArrayList;
import java.util.List;

public class Manager {
    private static final String ADD_CAT = "add_cat";
    private static final String ADD_MOUSE = "add_mouse";
    private static final String ADD_DRY_FOOD = "add_dry_food";
    private static final String ADD_WET_FOOD = "add_wet_food";
    private static final String EAT_MOUSE = "eat_mouse";
    private static final String EAT_DRY_FOOD = "eat_dry_food";
    private static final String EAT_WET_FOOD = "eat_wet_food";

    private final List<Cat> cats = new ArrayList<>();
    private final List<Mouse> mouses = new ArrayList<>();

    private final List<DryFood> dryFoods = new ArrayList<>();


    public void handle(final String[] args) {
        final String command = args[0];

        switch (command) {
            case ADD_CAT:
                addCat(args);
                break;
            case ADD_MOUSE:
                addMouse(args);
                break;
            case EAT_MOUSE:
                eatMouse(args);
                break;
            case EAT_DRY_FOOD:
                eatDryFood(args);
                break;
            case ADD_DRY_FOOD:
                addDryFood(args);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + command);
        }
    }

    private void addDryFood(
            String[] args
    ) {
        String name = args[1];
    dryFoods.add(new DryFood(name));
    System.out.println("Корм под брендом " + name + " добавлен");

    }

    private void eatDryFood(String[] args) {
        String catName = args[1];
        String dryFoodName = args[2];
        Cat cat = findCatByName(catName);
        DryFood dryFood = dryFoods.stream()
                .filter(item -> item.getBrand().equals(dryFoodName))
                .findFirst()
                .orElseThrow();
        dryFood.eat(cat);
    }

    private void eatMouse(String[] args) {
        String catName = args[1];
        String mouseName = args[2];

        Cat cat = findCatByName(catName);

        Mouse mouse = mouses.stream()
                .filter(item -> item.getName().equals(mouseName))
                .findFirst()
                .orElseThrow();

        mouse.kill(cat);
    }

    private void addMouse(
            String[] args
    ) {
        String name = args[1];
        mouses.add(new Mouse(name));
        System.out.println("Мышь по имени " + name + " добавлена!");
    }

    private void addCat(
            String[] args
    ) {
        String name = args[1];
        String color = args[2];
        Sex sex = Sex.valueOf(args[3]);
        int lapkiNumber = Integer.parseInt(args[4]);
        int eyeNumber = Integer.parseInt(args[5]);

        Cat newCat = new Cat();
        newCat.setName(name);
        newCat.setColor(color);
        newCat.setSex(sex);
        newCat.setLapkiNumber(lapkiNumber);
        newCat.setEyeNumber(eyeNumber);
        cats.add(newCat);
        // Kot po imeni IMYA dobavlen!
        StringBuilder builder = new StringBuilder();
        if (sex.equals(Sex.MALE)) {
            builder.append("Кот");
        } else {
            builder.append("Кошка");
        }
        builder.append(" по имени ")
                .append(name)
                .append(" добавлен!");
        System.out.println(builder);
    }

    private Cat findCatByName(String name) {
        return cats.stream()
                .filter(item-> item.getName().equals(name))
                .findFirst()
                .orElseThrow();
    }
}
