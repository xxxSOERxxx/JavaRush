package JavaRush;

public class cicle10x10 {
    public static void main(String[] args) {

        int i = 1;
        int a = 1;
        while (i < 11) {
            int j = 1;
            while (j < 11) {
                a = i * j;
                System.out.print(a + " ");

                j = j + 1;
            }
            System.out.println();
            i = i + 1;
        }
    }
}