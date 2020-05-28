package JavaRush5;

public class CatFight {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Zosya", 2, 4, 10);
        Cat cat2 = new Cat("Mosya", 4, 6, 20);
        Cat cat3 = new Cat("Pussy", 1, 10, 3);
        System.out.println(cat1.fight(cat2));
        System.out.println(cat1.fight(cat3));
        System.out.println(cat2.fight(cat3));
    }

    public static class Cat {

        protected String name;
        protected int age;
        protected int weight;
        protected int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat) {
            int ageScore = Integer.compare(this.age, anotherCat.age);
            int weightScore = Integer.compare(this.weight, anotherCat.weight);
            int strengthScore = Integer.compare(this.strength, anotherCat.strength);

            int score = ageScore + weightScore + strengthScore;
               return score > 0; // return score > 0 ? true : false;
        }
    }
}
