package JavaRush10;

import java.util.ArrayList;

public class ArrayArrayList {
           public static void main (String[]args){
            ArrayList<String>[] arrayOfStringList = createList();
            printList(arrayOfStringList);
        }

        public static ArrayList<String>[] createList () {
            ArrayList<String>[] strings = new ArrayList[3];
            ArrayList<String> list1 = new ArrayList<>();
            ArrayList<String> list2 = new ArrayList<>();
            ArrayList<String> list3 = new ArrayList<>();

            list2.add("вторник");
            list2.add("вторник");
            list2.add("вторник");
            list3.add("среда");
            list3.add("среда");
            list3.add("среда");
            list3.add("среда");
            list1.add("понедельник");
            list1.add("понедельник");
            list1.add("понедельник");
            strings[0] = list1;
            strings[1] = list2;
            strings[2] = list3;
            return strings;
        }

        public static void printList (ArrayList < String >[]arrayOfStringList){
            for (ArrayList<String> list : arrayOfStringList) {
                for (String s : list) {
                    System.out.println(s);
                }
            }
        }
    }



        





