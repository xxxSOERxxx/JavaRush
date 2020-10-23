package JavaRush11;

public class HobbyClass {
    public static void main(String[] args) {

        System.out.println(new Hobby().toString());
        System.out.println(Dream.HOBBY.toString());
    }

    interface Desire {
    }

    interface Dream {
        Hobby HOBBY = new Hobby();
    }

    static class Hobby implements Dream, Desire {
        static int INDEX = 1;

        @Override
        public String toString() {
            INDEX++;
            return "" + INDEX;
        }
    }
}
