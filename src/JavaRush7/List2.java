package JavaRush7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class List2 {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            String a = reader.readLine();
            list.add(a);
        }
        for (int i = 0; i < 13; i++) {
            list.add(0, (list.get(4)));
            list.remove(5);
        }

        for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
        }
    }
}
