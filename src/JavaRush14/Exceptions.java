package JavaRush14;

import javax.annotation.processing.FilerException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.rmi.server.ServerCloneException;
import java.util.ArrayList;
import java.util.List;

public class Exceptions {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }
       exceptions.add(new StringIndexOutOfBoundsException());
       exceptions.add(new RuntimeException());
       exceptions.add(new FileNotFoundException());
       exceptions.add(new NullPointerException());
       exceptions.add(new IndexOutOfBoundsException());
       exceptions.add(new ArrayStoreException());
       exceptions.add(new NumberFormatException());
       exceptions.add(new NegativeArraySizeException());
       exceptions.add(new IllegalAccessException());
        //напишите тут ваш код

    }
}

