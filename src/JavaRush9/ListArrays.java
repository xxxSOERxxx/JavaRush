package JavaRush9;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ListArrays {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);

    }

    public static ArrayList<int[]> createList() {
        ArrayList<int[]> list = new ArrayList<>();
       int[] array1 = {4, 5, 8, 19, 7};
       int[] array2 = {4, 5};
       int[] array3 = {4, 5, 54, 66};
       int[] array4 = {4, 5, 54, 66, 6, 55, 128};
       int[] array5 = {};

        list.add(array1);
        list.add(array2);
        list.add(array3);
        list.add(array4);
        list.add(array5);
        return list;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
