package project;

import project.animals.Mouse;
import project.cats.Cat;
import project.cats.MainCat;
import project.cats.Sex;
import project.food.DryFood;
import project.food.WetFood;
import project.toys.CardboardScratchingPost;
import project.toys.WoodScratchingPost;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final Manager manager = new Manager();

    public static void main(String[] args) {
     //   manager.handle(args);
        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {
            String line = in.nextLine();
            manager.handle(line.split(" "));
        }

        /*
        Arrays.stream(args).forEach(item -> {
            System.out.println("args: " + item);
        });




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

        WetFood kitekat = new WetFood("Китикет");
        DryFood whiskas = new DryFood("Вискас");
        whiskas.eat(tiger);
        kitekat.eat(cezar);
        WoodScratchingPost wood = new WoodScratchingPost();
        wood.scratch(tiger);
        CardboardScratchingPost cardboard = new CardboardScratchingPost();
        cardboard.scratch(cezar);

         */

    }


}