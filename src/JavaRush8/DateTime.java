package JavaRush8;

import java.util.*;

public class DateTime {
    public static void main(String[] args) {
        System.out.println(getInsertTimeInMs(new ArrayList()));
        System.out.println(getInsertTimeInMs(new LinkedList()));
    }

    public static long getInsertTimeInMs(List list) {
        // напишите тут ваш код
        Date start = new Date();
        insert10000(list);
        Date finish = new Date();
        long time = finish.getTime() - start.getTime();
         return time;
    }

    public static void insert10000(List list) {
        for (int i = 0; i < 10000; i++) {
            list.add(0, new Object());
        }
    }

}
