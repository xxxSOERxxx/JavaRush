package JavaRush9;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;

public class DateFormat {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(isDateOdd(reader.readLine()));
    }

    public static String isDateOdd(String date) throws Exception {
        SimpleDateFormat formatter1 = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        SimpleDateFormat formatter2 = new SimpleDateFormat("MMM dd, yyyy", DateFormatSymbols.getInstance(Locale.ENGLISH));
//        formatter2.setDateFormatSymbols();
        Date date1 = formatter1.parse(date);
//        DateFormatSymbols dfs = new DateFormatSymbols();
//        dfs.getShortMonths();
        return formatter2.format(date1).toUpperCase();

    }

//            public String[] getShortMonths() {
//                return (String[]) Arrays.copyOf(this.shortMonths, this.shortMonths.length);
//            }
        }

