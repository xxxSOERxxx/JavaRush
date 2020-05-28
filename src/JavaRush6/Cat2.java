package JavaRush6;

import java.util.ArrayList;

public class Cat2 {
    public static ArrayList<Cat2> cats = new ArrayList<>();
       public static void main(String[] args) {
           Cat2 thomas = new Cat2();
           Cat2 behemoth = new Cat2();
           Cat2 philipp = new Cat2();
           Cat2 pushok2 = new Cat2();
           Cat2 pushok3 = new Cat2();
           Cat2 pushok4 = new Cat2();
           Cat2 pushok5= new Cat2();
           Cat2 pushok6 = new Cat2();
           Cat2 pushok7 = new Cat2();
           Cat2 pushok8 = new Cat2();

           cats.add(thomas);
           cats.add(behemoth);
           cats.add(philipp);
           cats.add(pushok2);
           cats.add(pushok3);
           cats.add(pushok4);
           cats.add(pushok5);
           cats.add(pushok6);
           cats.add(pushok7);
           cats.add(pushok8);
           printCats();
    }

           public Cat2() {
        }

        public static void printCats() {
            System.out.println(cats.toString());
            for (int i = 0; i < cats.size(); i++)
            System.out.println(cats.get(i));
        }
    }
