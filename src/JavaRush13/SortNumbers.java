package JavaRush13;

import java.io.*;
import java.util.ArrayList;


public class SortNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        InputStream fis = new FileInputStream(br.readLine());
        BufferedReader fileInputStream = new BufferedReader(new InputStreamReader(fis));
        ArrayList<Integer> numbers = new ArrayList<>();
        try {
            String text = fileInputStream.readLine();
            while (text != null) {
                numbers.add(Integer.parseInt(text));
                text = fileInputStream.readLine();
            }

        } finally {
            br.close();
            fis.close();
            fileInputStream.close();
        }
        numbers = sort(numbers);
        for (Integer text : numbers) {
            if (text % 2 == 0)
                System.out.println(text);

//            else System.out.println("мимо");
        }
    }
    public static ArrayList<Integer> sort(ArrayList<Integer> array){
//        ArrayList<Integer> newArray = new ArrayList<>();

        for(int i = array.size() -1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){

                if( array.get(j) > array.get(j + 1)){
                    int tmp = array.get(j);
                    array.set(j, array.get(j+1));
                    array.set(j+1, tmp);
                }
            }
        }




        return array;
    }
}
