package JavaRush;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThreeNumbers {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String aS = bufferedReader.readLine();
        int a = Integer.valueOf(aS);
        String bS = bufferedReader.readLine();
        int b = Integer.valueOf(bS);
        String cS = bufferedReader.readLine();
        int c = Integer.valueOf(cS);

        if ((a > b) && (a > c)) {
            if (b > c)
                System.out.println(a + " " + b + " " + c);
            else
                System.out.println(a + " " + c + " " + b);
        } else if (b > c) {
            if (a > c)
                System.out.println(b + " " + a + " " + c);
            else
                System.out.println(b + " " + c + " " + a);
        } else if (a > b)
            System.out.println(c + " " + a + " " + b);
        else
            System.out.println(c + " " + b + " " + a);
    }
}