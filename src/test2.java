import java.util.Scanner;

public class test2 {
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);//класс для ввода данных
        Scanner d = new Scanner(System.in);
        System.out.println("Введите имя");
        String g = s.nextLine();//ввод строковых данных
        System.out.println("Введите возраст = 5");
        int x = d.nextInt();//ввод числовых данных

        while(x !=5){
            System.out.println("Возраст должен быть 5");
            x = d.nextInt();
        }

        System.out.println("Молодец, тебя зовут " + g + " и тебе " + x + " годиков");
}}


