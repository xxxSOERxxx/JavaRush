package JavaRush6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChetNechet {
    public static int even = 0;
    public static int odd = 0;

    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String numberS = bufferedReader.readLine();
        int number = Integer.valueOf(numberS);
        while (true) {
            if (number % 2 == 0)
                ++even;
            else
                ++odd;
            if (number < 10)
                break;
            number = number / 10;

        }
        System.out.println("Even: " + even + " " + "Odd: " + odd);

        }

    }

