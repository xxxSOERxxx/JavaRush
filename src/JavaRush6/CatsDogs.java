package JavaRush6;

public class CatsDogs {
    public static void main(String[] args) {
        // напишите тут ваш код
        int i;
        for (i = 0; i < 50000; i++) {

            Cat cat = new Cat();
            Dog dog = new Dog();
        }
    }
}

    class Cat {
        @Override
        protected void finalize() throws Throwable {
            super.finalize();
            System.out.println("A Cat was destroyed");
        }
    }

    class Dog {

        @Override
        protected void finalize() throws Throwable {
            super.finalize();
            System.out.println("A Dog was destroyed");
        }
    }
