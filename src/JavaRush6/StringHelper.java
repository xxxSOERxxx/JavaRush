package JavaRush6;

public class StringHelper {
    public static void main(String[] args) {

    }
    public static String multiply(String s) {
        String result = "";
        result = s+s+s+s+s;
        return result;
    }

    public static String multiply(String s, int count) {
        String result = "";
        for (int i =0; i < count; i++) {
            result = result + s;
        }
        return result;
    }
}
