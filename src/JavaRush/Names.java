package JavaRush;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Names {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String a = bufferedReader.readLine();
        int aL = a.length();
        String b = bufferedReader.readLine();
        int bL = b.length();
        if (a.equals(b))
            System.out.println("Имена идентичны");
        else
        if (aL == bL)
            System.out.println("Длины имен равны");
            }
}
