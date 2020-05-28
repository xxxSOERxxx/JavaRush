package JavaRush10;

public class Konstruktori {
    public static void main(String[] args) {
    }

    public static class Human {
        private String name;
        private int age;
        private String address;
        private char sex;
        private String voice;
        private int penis;

        public Human(String name, String address, String voice) {
            this.name = name;
            this.address = address;
            this.voice = voice;
        }

        public Human(String name) {
            this.name = name;
        }

        public Human(int age) {
            this.age = age;
        }

        public Human(char sex) {
            this.sex = sex;
        }

        public Human(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Human(String name, int age, char sex) {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }

        public Human(String name, int age, String address, char sex, String voice, int penis) {
            this.name = name;
            this.age = age;
            this.address = address;
            this.sex = sex;
            this.voice = voice;
            this.penis = penis;
        }

        public Human(int age, String address, char sex, String voice, int penis) {
            this.age = age;
            this.address = address;
            this.sex = sex;
            this.voice = voice;
            this.penis = penis;
        }

        public Human(char sex, String voice, int penis) {
            this.sex = sex;
            this.voice = voice;
            this.penis = penis;
        }

        public Human(String name, int age, String address, char sex, String voice) {
            this.name = name;
            this.age = age;
            this.address = address;
            this.sex = sex;
            this.voice = voice;
        }
    }
}
