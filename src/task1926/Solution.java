package task1926;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Перевертыши
/home/masha/Desktop/txt.txt
*/

public class Solution {
    public static void main(String[] args) throws IOException {

                BufferedReader bufferedReader1 = new BufferedReader(new InputStreamReader(System.in));
                String data = bufferedReader1.readLine();
                bufferedReader1.close();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(data))) {
            String line;
            StringBuilder stringBuilder ;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(new StringBuilder().append(line).reverse());
            }
        }
    }
}
