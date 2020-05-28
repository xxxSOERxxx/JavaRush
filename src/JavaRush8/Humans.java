package JavaRush8;

import java.util.ArrayList;

public class Humans {
    public static void main(String[] args) {
        ArrayList<Human> childrens = new ArrayList<>();
        Human sun = new Human("Roman", true, 2, childrens);
        Human dauther1 = new Human("Monica", false, 8, childrens);
        Human dauther2 = new Human("Valary", false, 5, childrens);
        ArrayList<Human> parents = new ArrayList<>();
        parents.add(sun);
        parents.add(dauther1);
        parents.add(dauther2);
        Human mother = new Human("Anastasia", false, 30, parents);
        Human father = new Human("Eugene", true, 32, parents);
        ArrayList<Human> grandparents1 = new ArrayList<>();
        ArrayList<Human> grandparents2 = new ArrayList<>();
        grandparents1.add(mother);
        grandparents2.add(father);
        Human grandmother1 = new Human("Irina", false, 50, grandparents1);
        Human grandmother2 = new Human("Lyudmila", false, 55, grandparents2);
        Human grandfather1 = new Human("Nikolas", true, 60, grandparents1);
        Human grandfather2 = new Human("Vovan", true, 65, grandparents2);
        System.out.println(sun.toString());
        System.out.println(dauther1.toString());
        System.out.println(dauther2.toString());
        System.out.println(mother.toString());
        System.out.println(father.toString());
        System.out.println(grandmother1.toString());
        System.out.println(grandfather1.toString());
        System.out.println(grandmother2.toString());
        System.out.println(grandfather2.toString());


    }

    public static class Human {
        protected String name;
        protected boolean sex;
        protected int age;
        protected ArrayList<Human> children;


        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
