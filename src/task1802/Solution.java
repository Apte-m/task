package task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        FileInputStream stream = new FileInputStream(fileName);
        List<Integer> result = new ArrayList<>();
        while (stream.available() > 0) {
            int data = stream.read();
            result.add(data);
        }
        stream.close();
        System.out.println(result.stream().min( Integer::compare).get());
    }
}
