package JavaRush;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TrafficLight {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String aS = bufferedReader.readLine();
        Double t = Double.valueOf(aS);

            while (t >= 5) {
                t = t - 5;
            }

            if (t < 3) {
                System.out.println("зеленый");
            } else {
                if (t < 4) {
                    System.out.println("желтый");
                } else {
                    if (t < 5) {
                        System.out.println("красный");
                    }
        }
        }
    }
}





