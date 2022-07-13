package project;

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
        cezar.setColor("Black");
        cezar.setLapkiNumber(4);
        cezar.setEyeNumber(2);
        System.out.println(cezar);
        MainCat tiger = new MainCat();
        tiger.setLapkiNumber(4);
        tiger.setColor("white");
        System.out.println(tiger);


        Mouse mouse = new Mouse();
        System.out.println(mouse);
    }


}