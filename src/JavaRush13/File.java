package JavaRush13;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class File {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fileName = br.readLine();
        FileInputStream fileInputStream = new FileInputStream(fileName);
        try{
        while (fileInputStream.available() > 0)
            System.out.print((char)fileInputStream.read());}
        finally {
            br.close();
            fileInputStream.close();
        }

    }
}
