package JavaRush8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class LongArrayNubberrs {
    public static void main(String[] args) throws IOException {

        List<Integer> list = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {

            int a = Integer.parseInt(reader.readLine());

            list.add(a);

        }







        ArrayList<Integer> numbers = new ArrayList<>();

        int x = 1;

        for (int i = 1; i < list.size(); i++) {

            if (list.get(i-1).equals(list.get(i)))

                x++;

            else{

                numbers.add(x);

                x = 1;}

        }
        numbers.add(x);
        int maximum = numbers.get(0);

        for (int i = 0; i < numbers.size(); i++) {

            if (numbers.get(i) > maximum)

                maximum = numbers.get(i);

        }

        System.out.println(maximum);

    }

}
