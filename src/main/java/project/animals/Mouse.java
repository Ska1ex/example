package project.animals;

import project.cats.Cat;
import project.cats.Sex;

public class Mouse {
    private  String name;
    public Mouse(String name){
        this.name = name;
    }


    public String getName() {
        return name;

    }

    public void kill(Cat cat) {
      StringBuilder builder = new StringBuilder();
     builder.append("Мышь по имени ")
             .append(getName())
             .append(" убита ");
      if (cat.getSex().equals(Sex.MALE)){
          builder.append("Котом ");
      } else {
          builder.append("Кошкой ");
      }

      builder.append("по имени ")
                      .append(cat.getName());
        System.out.println(builder);
    }

}