package JavaRush6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class NubbersPoPoryadku {

    public static void main(String[] args) throws IOException {
        ArrayList<Integer> numbers = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String number1S = reader.readLine();
        int number1 = Integer.valueOf(number1S);
        numbers.add(number1);

        String number2S = reader.readLine();
        int number2 = Integer.valueOf(number2S);

        if (number2 < numbers.get(0))
        numbers.add(0, number2);
        else
            numbers.add(number2);

        String number3S = reader.readLine();
        int number3 = Integer.valueOf(number3S);

        if (number3 < numbers.get(0))
        numbers.add(0, number3);
        else
            if (number3 < numbers.get(1))
                numbers.add(1, number3);
            else
                numbers.add(number3);

        String number4S = reader.readLine();
        int number4 = Integer.valueOf(number4S);

        if ((number4 < numbers.get(0)))
            numbers.add(0, number4);
        else
        if (number4 < numbers.get(1))
            numbers.add(1, number4);
        else
        if (number4 < numbers.get(2))
            numbers.add(2, number4);
        else
            numbers.add(number4);


        String number5S = reader.readLine();
        int number5 = Integer.valueOf(number5S);
        if ((number5 < numbers.get(0)))
            numbers.add(0, number5);
        else
        if (number5 < numbers.get(1))
            numbers.add(1, number5);
        else
        if (number5 < numbers.get(2))
            numbers.add(2, number5);
        else
        if (number5 < numbers.get(3))
            numbers.add(3, number5);
        else
        numbers.add(number5);


        for (int i = 0; i < numbers.size(); i++)
            System.out.println(numbers.get(i));

    }
}
