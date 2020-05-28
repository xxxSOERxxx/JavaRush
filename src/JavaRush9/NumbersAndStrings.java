package JavaRush9;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class NumbersAndStrings {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) {
                break;
            }
            list.add(s);
        }

        String[] array = list.toArray(new String[0]);
        sort(array);


        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        ArrayList<Integer> array2 = new ArrayList<>();
        ArrayList<String> array3 = new ArrayList<>();
        for (String s : array) {
            if (isNumber(s)) {
                array2.add(Integer.parseInt(s));
            }
            else {
                array3.add(s);
            }
        }
             for (int i = array3.size() - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                    if (isGreaterThan(array3.get(j), array3.get(j + 1))) {
                        String tmp = array3.get(j);
                    array3.set(j, array3.get(j + 1));
                    array3.set(j +1, tmp);
                       }
            }
        }

        for (int i = array2.size() - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array2.get(j + 1) > array2.get(j)){
                    int tmp = array2.get(j);
                     array2.set(j, array2.get(j +1));
                     array2.set(j +1, tmp);
                 }
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (isNumber(array[i])) {
                array[i] = String.valueOf(array2.get(0));
                array2.remove(0);
            } else {
                array[i] = array3.get(0);
                array3.remove(0);
            }

        }
    }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String s) {
        if (s.length() == 0) {
            return false;
        }

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // Строка содержит '-'
                    || (!Character.isDigit(c) && c != '-') // или не цифра и не начинается с '-'
                    || (chars.length == 1 && c == '-')) // или одиночный '-'
            {
                return false;
            }
        }
        return true;
    }
}
