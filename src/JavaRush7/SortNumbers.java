package JavaRush7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class SortNumbers {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> listX3 = new ArrayList<>();
        ArrayList<Integer> listX2 = new ArrayList<>();
        ArrayList<Integer> listAll = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++) {
            int a = Integer.parseInt(reader.readLine());
            list.add(a);
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 3 == 0)
                listX3.add(list.get(i));
            if (list.get(i) % 2 == 0)
                listX2.add(list.get(i));
            else
                if (list.get(i) % 3 != 0)
                listAll.add(list.get(i));
                    }
        printList(listX3);
        printList(listX2);
        printList(listAll);
    }
    public static void printList(ArrayList<Integer> list){
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        }
}