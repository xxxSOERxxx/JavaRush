package JavaRush9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ReadData {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        try {
            while (true) {
               list.add(Integer.parseInt(reader.readLine()));
                }
        }
        catch (NumberFormatException | IOException e){
            for (Integer number : list){
                System.out.println(number);
            }

        }
    }
}
