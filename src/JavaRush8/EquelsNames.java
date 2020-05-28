package JavaRush8;

import java.util.*;

public class EquelsNames {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        map.put("арбуз", "ягода");
        map.put("банан", "трава");
        map.put("вишня", "ягода");
        map.put("груша", "фрукт");
        map.put("дыня", "овощ");
        map.put("ежевика", "куст");
        map.put("жень-шень", "корень");
        map.put("земляника", "ягода");
        map.put("ириc", "цветок");
        map.put("картофель", "клубень");
//        System.out.println(map);
        return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
         ArrayList<String> list = new ArrayList<>();
        for (Map.Entry<String, String> pair : map.entrySet()) {
            list.add(pair.getValue());
        }
//        System.out.println(list);
//        System.out.println();
        for (int i = 0; i < (list.size() - 1); i++) {
            for (int j = (list.size() - 1); j > i; j--) {
                if (list.get(j).equals(list.get(i))){
//                 System.out.println("Удалено: " + list.get(j) + ". Индекс: " + j);
                 removeItemFromMapByValue(map, list.get(j));
                 list.remove(j);
            }
            }
        }
//        System.out.println(map);
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());

            }
        }
    }

    public static void main(String[] args) {
        removeTheFirstNameDuplicates(createMap());

    }
}
