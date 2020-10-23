package JavaRush13;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StrokiExit {
           public static void main(String[] args) throws IOException {
               BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
               List<String> array = new ArrayList<>();
               String outputFileName = br.readLine();
               String text;
               while (true){
                   text = br.readLine();
                    array.add(text);
                   if (text.equals("exit")){
                       break;
                   }
                  }



               try (BufferedWriter writter = new BufferedWriter(new FileWriter(outputFileName))) {
                   for (String value : array) {
                       writter.write(value + "\n");
                   }
               }
               catch (IOException e) {
                   e.printStackTrace();
               }
        }
    }


