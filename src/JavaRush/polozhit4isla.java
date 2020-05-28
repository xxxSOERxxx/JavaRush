package JavaRush;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class polozhit4isla {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String aS = bufferedReader.readLine();
        int a = Integer.valueOf(aS);
        String bS = bufferedReader.readLine();
        int b = Integer.valueOf(bS);
        String cS = bufferedReader.readLine();
        int c = Integer.valueOf(cS);
        System.out.println("количество положительных чисел: " + run(a, b, c));
        System.out.println("количество отрицательных чисел: " + run2(a, b, c));


        }

    private static int run(int a, int b, int c) {
        int i = 0;
        if (a > 0)
            i = i + 1;
        if (b > 0)
            i = i + 1;
        if (c > 0)
            i = i + 1;
         return i;
    }
    private static int run2(int a, int b, int c) {
        int i = 0;
        if (a < 0)
            i = i + 1;
        if (b < 0)
            i = i + 1;
        if (c < 0)
            i = i + 1;
         return i;
    }
}
