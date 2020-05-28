package JavaRush;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PairNumbers {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String aS = bufferedReader.readLine();
        int a = Integer.valueOf(aS);
        String bS = bufferedReader.readLine();
        int b = Integer.valueOf(bS);
        String cS = bufferedReader.readLine();
        int c = Integer.valueOf(cS);
        if ((a == b) & (a == c)){
            System.out.println(a + " " + b + " " + c);}
        else
        if (a == b)
            System.out.println(a + " " + b);
        else
        if (a == c)
            System.out.println(a + " " + c);
        else
        if (b == c)
            System.out.println(b + " " + c);
    }



}
