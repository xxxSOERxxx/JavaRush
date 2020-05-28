package JavaRush6;

public class TheoremaPifahora {
    public static double getDistance(int x1, int y1, int x2, int y2) {

        double a = Math.sqrt((Math.pow((x2 - x1), 2)) + (Math.pow((y2 - y1), 2)));
                return a;
    }

    public static void main(String[] args) {
        System.out.println(getDistance(2, 2, 5, 6));
    }
}
