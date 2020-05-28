package JavaRush8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class MinNumbers {
    public static void main(String[] args) throws IOException {
        List<Integer> integerList = getIntegerList();

        System.out.println(getMinimum(integerList));
}

    public static int getMinimum(List<Integer> array) {
        int min = array.get(0);
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) < min)
                min = array.get(i);
        }
        return min;
    }

    public static List<Integer> getIntegerList() throws IOException {
        List<Integer> integerList = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(reader.readLine());
            integerList.add(a);
        }
        return integerList;
    }
}
