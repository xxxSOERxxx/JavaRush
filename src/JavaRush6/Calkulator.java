package JavaRush6;

public class Calkulator {
    public static int plus(int a, int b) {

        return (a + b);
    }

    public static int minus(int a, int b) {
        //напишите тут ваш код
        return (a - b);
    }

    public static int multiply(int a, int b) {
        //напишите тут ваш код
        return (a * b);
    }

    public static double division(int a, int b) {
        //напишите тут ваш код
        return ((double) a / (double) b);
    }

    public static double percent(int a, int b) {
        //напишите тут ваш код
        return (((double) b * (double) a) / 100);
    }

    public static void main(String[] args) {
        System.out.println(division(10, 2));
        System.out.println(percent(5, 20));
    }
}
