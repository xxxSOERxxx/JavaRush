public class test1 {
    public static void main(String [] args) {
        System.out.println("Пашка ");
        int myInt = 10;
        short myShort = 3250; // от -32000 до 32000
        long myLong = 64000; // длинные
        double myDouble = 25.45;
        float myFloat = 5454 / 4f; //типа double
        char myChar = 'd'; // символ
        boolean myBoolean = true; //может быть или true или false
        byte myByte = 32; //от -128 до 128
        String s = "Hello";
        System.out.println(s + ' ' + myInt);
        if (myInt == 1) {//если условие выполняется
            while (myInt < myDouble) {//цикл пока выполняется условие
                System.out.println(myInt); // sout + Tab
                myInt = myInt + 2;
            }
        }
        else{
                System.out.println("if не выполняется");
             }

        for (int a = 1; a < 5; a++){            //a++ это a = a+1
            System.out.println("555   " + a);
        }


    }}


