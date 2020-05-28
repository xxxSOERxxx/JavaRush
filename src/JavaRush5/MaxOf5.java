package JavaRush5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaxOf5 {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String aS = bufferedReader.readLine();
        int a = Integer.valueOf(aS);
        if (a > 0) {
            int i = 0;
            int number = -2147483648;
            while (i < a){
                String numberS = bufferedReader.readLine();
                int number2 = Integer.valueOf(numberS);
                number = (number2 > number) ? number2 : number;
                i++;
            }
            System.out.println(number);
        }
    }
}