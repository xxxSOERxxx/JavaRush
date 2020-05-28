package JavaRush8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class FamilyesCityes {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<String> list = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        while (true) {
            String family = reader.readLine();
            if (family.isEmpty()) {
                break;
            }
            list.add(family);
            String city = reader.readLine();
            if (city.isEmpty()) {
                list2.add("");
            }
            else
            list2.add(city);
        }

        // Read the house number
        String LifeCity = reader.readLine();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(LifeCity)){
                  System.out.println(list2.get(i));
              }
          }

    }
}
