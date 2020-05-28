package JavaRush6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ConsoleReader {
    public static String readString() throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String read = bufferedReader.readLine();
        return read;
    }

    public static int readInt() throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int read2 = Integer.valueOf(bufferedReader.readLine());
        return read2;

    }

    public static double readDouble() throws Exception {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        double read3 = Double.parseDouble(bis.readLine());
        return read3;

    }

    public static boolean readBoolean() throws Exception {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        boolean read4 = Boolean.valueOf(bis.readLine());
         return read4;
    }

    public static void main(String[] args) throws Exception {

    }
}
