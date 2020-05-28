package JavaRush;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class cicles {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String s = bufferedReader.readLine();
        String bS = bufferedReader.readLine();
        int b = Integer.valueOf(bS);
        int i = 0;
        while (b > i){
            System.out.println(s);
        i = i + 1;}
    }
}
