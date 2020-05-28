package JavaRush8;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


public class Map1Name2Name {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Сталлоне", dateFormat.parse("MAY 1 2012"));
        map.put("Киркоров", dateFormat.parse("DECEMBER 6 1987"));
        map.put("Бьенсе", dateFormat.parse("APRIL 15 2001"));
        map.put("Свифт", dateFormat.parse("MARCH 3 2010"));
        map.put("Чан", dateFormat.parse("JULY 23 2002"));
        map.put("Сэндлер", dateFormat.parse("AUGUST 5 2003"));
        map.put("Альба", dateFormat.parse("SEPTEMBER 29 1999"));
        map.put("Билан", dateFormat.parse("OCTOBER 9 2005"));
        map.put("Прохоров", dateFormat.parse("JUNE 4 2008"));
        map.put("Сталин", dateFormat.parse("JUNE 2 2010"));

            return map;
        }


        public static void removeAllSummerPeople (Map < String, Date > map) {
           Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
              while (iterator.hasNext()){
                 Calendar cal = Calendar.getInstance();
                 cal.setTime(iterator.next().getValue());
                 int month = cal.get(Calendar.MONTH);
                 if (month >= Calendar.JUNE && month <= Calendar.AUGUST)
                     iterator.remove();
            }

            for (Map.Entry<String, Date> next : map.entrySet()){
                String key = next.getKey();
                String value = next.getValue().toString();
                System.out.println(key + " - " + value);
            }
            }

        public static void main (String[]args) throws ParseException {
          removeAllSummerPeople(createMap());

        }

}
