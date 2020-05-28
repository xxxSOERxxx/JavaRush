package JavaRush;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DayOfWeek {
    public static void main(String[] args) throws IOException {


        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String number = bufferedReader.readLine();
        int numberInt = Integer.parseInt(number);
        if ((numberInt > 7) || (numberInt < 1)) {
            System.out.println("такого дня недели не существует");
        }
        else{
            switch (numberInt){
            case 1:
            System.out.println("понедельник");
            break;
            case 2:
            System.out.println("вторник");
                break;
            case 3:
            System.out.println("среда");
                break;
            case 4:
            System.out.println("четверг");
                break;
            case 5:
            System.out.println("пятница");
                break;
            case 6:
            System.out.println("суббота");
                break;
            case 7:
            System.out.println("воскресенье");
                break;
        }}

    }
}
