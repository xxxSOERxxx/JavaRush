package JavaRush8;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DaysOfYear {
    public static void main(String[] args) throws Exception {
        System.out.println(isDateOdd("JANUARY 1 2000"));
    }

    public static boolean isDateOdd(String date) throws Exception {
        SimpleDateFormat formatter1 = new SimpleDateFormat("MMMM d yyyy", Locale.ENGLISH);
        Date date1 = formatter1.parse(date);
//        System.out.println(date1);
        int year = date1.getYear() + 1900;
        String yearS = String.valueOf(year);
//        System.out.println(yearS);
        Date date2 = formatter1.parse("JANUARY 1 " + yearS);
//        System.out.println(date2);
        long msec = date1.getTime() - date2.getTime();
        int days = (int)((msec / (24 * 60 * 60 * 1000)) + 1);
//        System.out.println(days);
        if (days % 2 != 0)
        return true;
        else
            return false;
    }
}
