package JavaRush5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sum {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            int sum = 0;
            while (true){
                String numberS = bufferedReader.readLine();
                if (numberS.equals("сумма"))
                    break;
                int number2 = Integer.valueOf(numberS);

                sum = sum + number2;
            }
            System.out.println(sum);
        }
    }

