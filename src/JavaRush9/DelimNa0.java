package JavaRush9;



public class DelimNa0 {
    public static void main(String[] args) {
        try{
        divideByZero();}
        catch (ArithmeticException e){
              e.printStackTrace();

               }
    }
    public static void divideByZero() throws ArithmeticException{
        System.out.println(5 / 0);
    }
}
