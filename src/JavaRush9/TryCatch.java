package JavaRush9;




public class TryCatch {
    public static void main(String[] args) {
        try {
            int num = Integer.parseInt("XYZ");
            System.out.println(num);
        }

        catch (NumberFormatException e){
            System.out.println("NumberFormatException");

        }
        //напишите тут ваш код
    }
}
