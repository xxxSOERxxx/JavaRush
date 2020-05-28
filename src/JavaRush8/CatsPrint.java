package JavaRush8;

import java.util.HashSet;

import java.util.Set;

public class CatsPrint {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
for (Cat cat : cats) {
    cats.remove(cat);
    break;
    }
        printCats(cats);
    }

    public static Set<Cat> createCats() {

        Set<Cat> set = new HashSet<>();
        Cat cat1 = new Cat("Васька");
        set.add(cat1);
        Cat cat2 = new Cat("Мурка");
        set.add(cat2);
        Cat cat3 = new Cat("Пушок");
        set.add(cat3);



        return set;
    }

    public static void printCats(Set<Cat> cats) {
        for (Cat text : cats) {
            System.out.println(text);
        }
    }
public static class Cat{
String name;


    public Cat(String name) {
        this.name = name;

    }

    @Override
    public String toString() {
        return name;
    }
}

}
