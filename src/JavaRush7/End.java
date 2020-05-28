package JavaRush7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class End {
    public static void main(String[] args) throws IOException, InterruptedException {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String a = reader.readLine();
            if (a.equals("end"))
            break;
            else
            list.add(a);
            }
        for (String string : list) {
            System.out.println(string);
            Thread.sleep(500);
        }
    }
}