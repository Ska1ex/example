package project;

import project.animals.Mouse;
import project.cats.Cat;
import project.cats.MainCat;
import project.cats.Sex;
import project.food.DryFood;
import project.toys.CardboardScratchingPost;
import project.toys.WoodScratchingPost;

public class Main {
    public static void main(String[] args) {
        /*
        * skolko lap (lapkiNumer)
        * stolko glaz (eyeNumber)
        * tsvet (color)
        * Cat
        *
         */

        /*
         * Sozdat drugie typy Mouse.
         * Sdelat' funcsiu kill, kotoraya budet prinimat' mause.
         *
         * Petchatat' v console, chto mysh poimana.
         *
         * Sozdat' functsiu feed (poest')
         *
         * Sozdat' classy korma (suhoi, vlazniy) s obschim roditelem.
         * Food -> Suhoi i vazhniy.
         *
         */
        System.out.println("Hello");
        Cat cezar = new Cat();
        cezar.setName("Цезарь");
        cezar.setColor("Black");
        cezar.setLapkiNumber(4);
        cezar.setEyeNumber(2);
        cezar.setSex(Sex.FEMALE);
        System.out.println(cezar);
        MainCat tiger = new MainCat();
        tiger.setName("Тигр");
        tiger.setLapkiNumber(4);
        tiger.setColor("white");
        tiger.setSex(Sex.MALE);
        System.out.println(tiger);



        Mouse mouse = new Mouse("Крыс");
        System.out.println(mouse);
        Mouse mouse1 = new Mouse("Гаечка");
      //  mouse.setName();
        mouse.kill(tiger);
        mouse1.kill(cezar);

        DryFood whiskas = new DryFood("Вискас");
        whiskas.eat(tiger);
        WoodScratchingPost wood = new WoodScratchingPost();
        wood.scratch(tiger);
        CardboardScratchingPost cardboard = new CardboardScratchingPost();
        cardboard.scratch(cezar);

    }


}