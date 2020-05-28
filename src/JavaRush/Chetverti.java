package JavaRush;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chetverti {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String aS = bufferedReader.readLine();
        int a = Integer.valueOf(aS);
        String bS = bufferedReader.readLine();
        int b = Integer.valueOf(bS);
        if (a >0){
            if (b > 0)
                System.out.println(1);
            else
                System.out.println(4);}
            else
                if (b > 0)
                    System.out.println(2);
                else
                    System.out.println(3);

    }
}
