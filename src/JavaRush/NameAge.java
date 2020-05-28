package JavaRush;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class NameAge {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String name = bufferedReader.readLine();
        String ageS = bufferedReader.readLine();
        int age = Integer.valueOf(ageS);
        if (age < 18)
            System.out.println("Подрасти еще");

    }
}