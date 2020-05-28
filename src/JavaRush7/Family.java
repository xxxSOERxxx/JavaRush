package JavaRush7;

public class Family {
    public static void main(String[] args) {
        Human human1 = new Human("Павел", true, 60);
        Human human2 = new Human("Катя", false, 75);
        Human human8 = new Human("Вера", false, 79);
        Human human9 = new Human("Вова", true, 77);
        Human human3 = new Human("Аня", false, 41, human1, human2);
        Human human4 = new Human("Миша", true, 45, human9, human8);
        Human human5 = new Human("Алекс", true, 15, human4, human3);
        Human human6 = new Human("Витя", true, 18, human4, human3);
        Human human7 = new Human("Света", false, 10, human4, human3);
        System.out.println(human1.toString());
        System.out.println(human2.toString());
        System.out.println(human8.toString());
        System.out.println(human9.toString());
        System.out.println(human3.toString());
        System.out.println(human4.toString());
        System.out.println(human5.toString());
        System.out.println(human6.toString());
        System.out.println(human7.toString());

    }

    public static class Human {
        protected String name;
        protected boolean sex;
        protected int age;
        protected Human father;
        protected Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}
