import java.util.Scanner;

public class test3 {
    public static void main(String [] args) {
        Scanner vvod = new Scanner(System.in);
        int a;
        do {
            System.out.println("Введите 5");
            a = vvod.nextInt();
        }
        while (a != 5);

        System.out.println("Все круто!");


    }
}
