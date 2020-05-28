package JavaRush8;

import java.util.HashMap;
import java.util.Map;

public class EquelsNumbers {
    public static Map<String, Integer> createMap() {
        Map<String, Integer> map = new HashMap<>();
        map.put("арбуз", 150);
        map.put("банан", 600);
        map.put("вишня", 499);
        map.put("груша", 1000);
        map.put("дыня", 800);
        map.put("ежевика", 380);
        map.put("жень-шень", 2000);
        map.put("земляника", 820);
        map.put("ириc", 550);
        map.put("картофель", 600);
//        System.out.println(map);
        return map;
    }

//    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
//        ArrayList<String> list = new ArrayList<>();
//        for (Map.Entry<String, String> pair : map.entrySet()) {
//            list.add(pair.getValue());
//        }
//        System.out.println(list);
//        System.out.println();
//        for (int i = 0; i < (list.size() - 1); i++) {
//            for (int j = (list.size() - 1); j > i; j--) {
//                if (list.get(j).equals(list.get(i))){
//                 System.out.println("Удалено: " + list.get(j) + ". Индекс: " + j);
//                    removeItemFromMapByValue(map, list.get(j));
//                    list.remove(j);
//                }
//            }
//        }
//        System.out.println(map);
//    }

    public static void removeItemFromMapByValue(Map<String, Integer> map) {
        Map<String, Integer> copy = new HashMap<>(map);
        for (Map.Entry<String, Integer> pair : copy.entrySet()) {
            Integer n = pair.getValue();
            if (n < 500) {
                map.remove(pair.getKey());

            }
        }
        System.out.println(map);
    }

    public static void main(String[] args) {
        removeItemFromMapByValue(createMap());

    }
}
