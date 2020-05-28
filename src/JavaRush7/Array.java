package JavaRush7;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Array {
    public static void main(String[] args) throws Exception {
            int[] array1 = new int[15];
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            for(int i = 0; i < array1.length; i++)
                array1[i] = Integer.parseInt(reader.readLine());
           int a = 0, b = 0;
           for (int i = 0;  i < array1.length; i = i +2)
               a = a + array1[i];
           for (int i = 1;  i < array1.length; i = i +2)
               b = b + array1[i];
           if (a > b)
               System.out.println("В домах с четными номерами проживает больше жителей.");
           else
               System.out.println("В домах с нечетными номерами проживает больше жителей.");
            }
     }
