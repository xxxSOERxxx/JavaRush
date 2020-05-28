package JavaRush9;



import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CatsMap {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        Map<String, Cat> Map = new HashMap<>();
        Map.put("Vaska", new Cat("Vaska"));
        Map.put("Vask", new Cat("Vask"));
        Map.put("Vas", new Cat("Vas"));
        Map.put("aska", new Cat("aska"));
        Map.put("Vska", new Cat("Vska"));
        Map.put("Vaka", new Cat("Vaka"));
        Map.put("Vaa", new Cat("Vaa"));
        Map.put("Va", new Cat("Va"));
        Map.put("V", new Cat("V"));
        Map.put("ka", new Cat("ka"));
        return Map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        Set<Cat> cats = new HashSet<>();
        for (Map.Entry<String, Cat> pair : map.entrySet()) {
            cats.add(pair.getValue());
        }
          return cats;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }
}
