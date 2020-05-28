package JavaRush;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThreeNumbers2 {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String aS = bufferedReader.readLine();
        int a = Integer.valueOf(aS);
        String bS = bufferedReader.readLine();
        int b = Integer.valueOf(bS);
        String cS = bufferedReader.readLine();
        int c = Integer.valueOf(cS);
        if ((a != b) && (a != c) && (b != c));

            else
        if ((a != b) && (a != c))
                System.out.println(1);
        else
        if ((b != a) && (b !=c))
        System.out.println(2);
        else
        if ((c != a) && (c !=b))
        System.out.println(3);

    }
}