package JavaRush;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DaysOfYear {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String number = bufferedReader.readLine();
        int year = Integer.parseInt(number);
        if (year % 400 == 0){
            System.out.println("количество дней в году: 366");
        }
        else{
            if (year % 100 == 0){
            System.out.println("количество дней в году: 365");}

        else {
                if (year % 4 == 0) {
                    System.out.println("количество дней в году: 366");
                } else {
                    System.out.println("количество дней в году: 365");
                }
            }}}
    }

