package JavaRush;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Es4eVosmerki {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String aS = bufferedReader.readLine();
        for (int i = 1; i <= 10; i = i + 1) {
            System.out.println(aS + " любит меня.");
        }
    }
}
