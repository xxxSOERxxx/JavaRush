package JavaRush5;

public class DogCatMouse {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Bob", 21, "Minsk");
        Cat cat = new Cat("Zack", 30, "Moscow");
        Mouse mouse = new Mouse("Micky", 2, "Moscow");
    }
    public static class Dog {
        private String name;
        private int age;
        private String address;

        public Dog(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }
        public static class Mouse {
        private String name;
        private int age;
        private String address;

        public Mouse(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }
    public static class Cat {
        private String name;
        private int age;
        private String address;

        public Cat(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }
}
