package JavaRush10;

import JavaRush7.Array;
import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class First {
            public static void main(String[] args) throws Exception {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            // Алфавит
            List<Character> alphabet = Arrays.asList(
                    'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж',
                    'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о',
                    'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц',
                    'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я');

            // Ввод строк
            ArrayList<String> list = new ArrayList<String>();
            for (int i = 0; i < 10; i++) {
                String s = reader.readLine();
                list.add(s.toLowerCase());
            }
            int[] count = new int[alphabet.size()];
                 for (int j = 0; j < alphabet.size(); j++) {
                     char c = alphabet.get(j);
                     for (int i = 0; i < list.size(); i++) {

                             char[] tmp = list.get(i).toCharArray();
                             for (int k = 0; k < tmp.length; k++) {
                                 if (tmp[k] == c) {
                                     count[j]++;
                                 }
                             }
                         }
                     }
                for (int j = 0; j < alphabet.size(); j++) {
                    System.out.println(String.valueOf(alphabet.get(j)) +" " + count[j]);
                }

             }
    }


