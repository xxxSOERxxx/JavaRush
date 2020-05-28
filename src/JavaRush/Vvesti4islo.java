package JavaRush;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Vvesti4islo {
    public static void main(String[] args) throws Exception{
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String number = bufferedReader.readLine();
        int numberInt = Integer.parseInt(number);
        if (numberInt > 0){
            System.out.println(numberInt * 2);}
            else {
            if (numberInt < 0) {
                System.out.println(numberInt + 1);
            } else {
                System.out.println(0);
            }
        }



    }
}
