package JavaRush;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TwoNumbers {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String aS = bufferedReader.readLine();
       int a = Integer.valueOf(aS);
        String bS = bufferedReader.readLine();
        int b = Integer.valueOf(bS);
        String cS = bufferedReader.readLine();
        int c = Integer.valueOf(cS);


        if ((a > b) && (b > c))
            System.out.println(b);
        else
        if ((a > c) && (c > b))
            System.out.println(c);
        else
        if ((b > c) && (c > a))
            System.out.println(c);
        else
        if ((b > a) && (a > c))
            System.out.println(a);
        else
        if ((c > a) && (a > b))
            System.out.println(a);
        else
        if ((c > b) && (b > a))
            System.out.println(b);
        else
        if ((a == b) || (a == c))
            System.out.println(a);
         else
        if (b == c)
            System.out.println(b);


    }
}
