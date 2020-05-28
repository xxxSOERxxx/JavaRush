import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner ggg = new Scanner (System.in);
        System.out.println ("How old are You?");
        int age = ggg.nextInt ();
        switch (age){
            case 0: System.out.println ("You were born.");
            break;
            case 7: System.out.println ("You are a schoolboy.");
            break;
            case 18: System.out.println ("You are a student.");
            break;
            default: System.out.println ("Your case is not here!!!"); }
    }
}
