package project.toys;

import project.cats.Cat;
import project.cats.Sex;

public class WoodScratchingPost implements ScratchingPost {
    @Override
    public void scratch(Cat cat) {
        StringBuilder builder = new StringBuilder();
        if (cat.getSex().equals(Sex.MALE)) {
            builder.append("Кот");
        } else {
            builder.append("Кошка");
        }
        builder.append(" по имени ")
                .append(cat.getName())
                .append(" скребет дерево ");
        System.out.println(builder);


    }
}
