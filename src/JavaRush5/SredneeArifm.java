package JavaRush5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SredneeArifm {
    public static void main(String[] args) throws IOException {
        float sum = 0f;
        int n =0;
         while (true) {

            InputStreamReader inputStreamReader = new InputStreamReader(System.in);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String aS = bufferedReader.readLine();
            int a = Integer.valueOf(aS);

            if (a == -1){
                System.out.println(sum / n);
                   break;
            }
             n++;
             sum = sum + a;

        }
    }
}
