package JavaRush10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class HashMapNew {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> map = new HashMap<>();
        while (true) {
            String valueS = reader.readLine();
            if (valueS.isEmpty()){
                break;
            }
            int value = Integer.parseInt(valueS);
            String key = reader.readLine();
            map.put(key, value);
        }
        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println(pair.getValue() + " " +pair.getKey());
        }

    }
}
