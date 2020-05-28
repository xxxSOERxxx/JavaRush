package JavaRush7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Meshanina {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        int M = Integer.parseInt(reader.readLine());
        for (int i = 0; i < N; i++) {
            String a = reader.readLine();
            list.add(a);
            }
        for (int i = 0; i < M; i++) {
            list.add(list.get(0));
            list.remove(0);
        }
        for (String string : list) {
            System.out.println(string);
        }
        }
}
