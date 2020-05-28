package JavaRush8;

import java.util.HashSet;
import java.util.Set;

public class SetL {
    public static Set<Integer> createSet() {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            set.add(1 + 2*i);
        }
        return set;
    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {

            set.removeIf(x -> (x > 10));

        return set;
    }

    public static void main(String[] args) {

        System.out.println(removeAllNumbersGreaterThan10(createSet()));
    }
}
