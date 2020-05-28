package JavaRush8;

import java.util.HashMap;
import java.util.Map;

public class MapCats {
    public static void main(String[] args) throws Exception {
        String[] cats = new String[]{"васька", "мурка", "дымка", "рыжик", "серый", "снежок", "босс", "борис", "визя", "гарфи"};

        Map<String, Cat> map = addCatsToMap(cats);

        for (Map.Entry<String, Cat> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }


    public static Map<String, Cat> addCatsToMap(String[] cats) {
        Map<String, Cat> Map = new HashMap<>();
        Cat[] catss= new Cat[cats.length];
        for (int i = 0; i < cats.length; i++) {
           catss[i] = new Cat(cats[i]);
            Map.put(catss[i].name, catss[i]);
               }
        return Map;
    }


    public static class Cat {
        String name;

        public Cat(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name != null ? name.toUpperCase() : null;
        }
    }
}
