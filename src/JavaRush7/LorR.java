package JavaRush7;


import java.util.ArrayList;

public class LorR {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("роза");
        strings.add("мера");
        strings.add("лоза");
        strings.add("лира");
        strings.add("вода");
        strings.add("упор");
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {


        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).indexOf('р') != -1)
                if (strings.get(i).indexOf('л') != -1){}
                else{
                    strings.remove(i);
                    i--;}
        }
        int length2 = strings.size();
        for (int i = 0; i < length2; i++) {
            if (strings.get(i).indexOf('л') != -1)
                if (strings.get(i).indexOf('р') != -1){}
                else{
                    strings.add(i, strings.get(i));
                i++;}
        }
        return strings;
    }
}
