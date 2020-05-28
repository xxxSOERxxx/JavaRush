package JavaRush7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class VozrastanieStroki {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            String a = reader.readLine();
            list.add(a);
        }
        for (int i = 0; i < (list.size() - 1); i++) {
            if (list.get(i).length() != (list.get(i + 1).length() - 1)){
                System.out.println(i + 2);
            break;}
        }
    }
}
