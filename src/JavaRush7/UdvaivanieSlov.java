package JavaRush7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class UdvaivanieSlov {
         public static void main(String[] args) throws Exception {
             ArrayList<String> list = new ArrayList<>();
             BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             for (int i = 0; i < 10; i++) {
                 String a = reader.readLine();
                 list.add(a);
             }

             ArrayList<String> result = doubleValues(list);

             for (String string : list) {
                 System.out.println(string);
             }
         }
        public static ArrayList<String> doubleValues(ArrayList<String> list) {
            for (int i = 0; i < list.size(); i++) {
                   list.add(i, list.get(i));
                        i++;
            }
                  return list;
        }
    }

