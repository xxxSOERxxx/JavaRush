package JavaRush;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Summa4isel {
    public static void main(String[] args) throws IOException {
        int sum = 0;
        while (true) {
            InputStreamReader inputStreamReader = new InputStreamReader(System.in);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String aS = bufferedReader.readLine();
            int a = Integer.valueOf(aS);
            sum = sum + a;
        if (a == -1){
            System.out.println(sum);
            break;
           }
        }


        }
}
