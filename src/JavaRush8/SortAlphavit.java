package JavaRush8;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class SortAlphavit {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] array = new String[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = reader.readLine();
        }
        sort(array);

        for (String word : array) {
            System.out.println(word);
        }
    }

    public static void sort(String[] array) {
        for(int i = array.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){

                if( isGreaterThan(array[j], array[j + 1])){
                    String tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }
//        String[] array2 = Arrays.copyOf(array, array.length);
//        String count = array2[19];
//        for (int i = 0; i < array2.length - 1; i++) {
//            for (int j = 0; j < array2.length - 1; j++) {
//
//                if (isGreaterThan(array2[i], array2[i + 1])) {
//                    count = array2[i];
//                }
//            }
//        }
    }

    //Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }
}
