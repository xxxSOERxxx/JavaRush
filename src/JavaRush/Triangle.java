package JavaRush;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Triangle {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String aS = bufferedReader.readLine();
        int a = Integer.parseInt(aS);
        String bS = bufferedReader.readLine();
        int b = Integer.parseInt(bS);
        String cS = bufferedReader.readLine();
        int c = Integer.parseInt(cS);
        if ((a >= (b + c)) | (b >= (a + c)) | (c >= (a + b))) {
            System.out.println("Треугольник не существует.");}
                else{
                System.out.println("Треугольник существует.");
            }
        }
    }

