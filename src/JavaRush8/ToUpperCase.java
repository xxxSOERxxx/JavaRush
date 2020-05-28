package JavaRush8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ToUpperCase {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        char[] strToArray = string.toCharArray();
        strToArray[0] = Character.toUpperCase(strToArray[0]);
        for (int i = 0; i < strToArray.length; i++) {
            if (strToArray[i] == ' '){
                strToArray[i + 1] = Character.toUpperCase(strToArray[i + 1]);
            }
        }
        for (int i = 0; i < strToArray.length; i++) {
            System.out.print(strToArray[i]);
        }

    }
}
