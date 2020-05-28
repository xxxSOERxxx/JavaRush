package JavaRush7;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayMax {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        int min = min(array);
        System.out.println(max + " " + min);
    }

    public static int[] initializeArray() throws IOException {
        int[] array = new int[20];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i < array.length; i++)
            array[i] = Integer.parseInt(reader.readLine());
        return array;
    }

    public static int max(int[] array) {
        int maximum = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maximum)
                maximum = array[i];
        }
        return maximum;
    }
    public static int min(int[] array) {
        int minimum = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minimum)
                minimum = array[i];
        }
        return minimum;
    }
}