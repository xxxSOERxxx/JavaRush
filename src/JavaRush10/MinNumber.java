package JavaRush10;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MinNumber {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[12];
        for (int i = 0; i < 12; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        System.out.println(array[9]);
        System.out.println(array[10]);
    }

    public static void sort(int[] array) {
//        int min = array[0];
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] < min)
//                min = array[i];
//        }
        Arrays.sort(array);

    }
}
//добавил для нового коммита
