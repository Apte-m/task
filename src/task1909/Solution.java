package task1909;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Замена знаков
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String inputFileName;
        String outputFileName;

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            inputFileName = reader.readLine();
            outputFileName = reader.readLine();
        }

        try (
                BufferedReader input = new BufferedReader(new FileReader(inputFileName));
                BufferedWriter output = new BufferedWriter(new FileWriter(outputFileName));) {


            List<String> list = new ArrayList<>();
            while (input.ready()) {
                list.add(input.readLine());
            }
            for (String result : list) {
                output.write(result.replaceAll("\\.", "!"));

            }
        }
    }
}
