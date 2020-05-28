package JavaRush9;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Bukvi {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        StringBuilder vowels = new StringBuilder();
        StringBuilder consonants = new StringBuilder();
        char[] strToArray = string.toCharArray();
        for (char c : strToArray) {
            if (isVowel(c)) {
                assert false;
                vowels.append(c).append(" ");
            } else {
                if (c != ' '){
                assert false;
                consonants.append(c).append(" ");}
            }
        }
        System.out.println(vowels.toString());
        System.out.println(consonants.toString());

    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char d : vowels) {  // ищем среди массива гласных
            if (c == d) {
                return true;
            }
        }
        return false;
    }
}
