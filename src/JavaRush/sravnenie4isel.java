package JavaRush;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class sravnenie4isel {
    public static void main(String[] args) throws Exception {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String number = bufferedReader.readLine();
        int a = Integer.parseInt(number);
        if ((a > 0) && (a < 1000)) {
            if ((a < 10) && (a % 2 == 0))
                System.out.println("четное однозначное число");
            else
            if ((a < 10) && (a % 2 != 0))
                System.out.println("нечетное однозначное число");
            else
            if ((a < 100) && (a % 2 != 0))
                System.out.println("нечетное двузначное число");
            else
            if ((a < 100) && (a % 2 == 0))
                System.out.println("четное двузначное число");
            else
            if (a % 2 == 0)
                System.out.println("четное трехзначное число");
            else
                System.out.println("нечетное трехзначное число");

        }
    }
}