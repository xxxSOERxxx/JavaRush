public class Break {
    public static void main(String[] args) {
        int i = 1;
        while (true){
            if (i == 5){
                break;
            }
            System.out.println ("Петля №" + i);
            i++;
        }
        System.out.println ("Мы вышли из цикла while!"); }
}
