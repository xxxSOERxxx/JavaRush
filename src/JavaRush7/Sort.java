package JavaRush7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Sort {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++) {
            int a = Integer.parseInt(reader.readLine());
            list.add(a);
        }
        for (int i = (list.size() - 1); i >= 0 ; i--) {
            System.out.println(list.get(i));
        }
    }
}


