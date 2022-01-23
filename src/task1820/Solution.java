package task1820;

import java.io.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;

/* 
Округление чисел
/home/masha/Desktop/txt.txt
*/

public class Solution {
    public static void main(String[] args) throws IOException {


        try (FileReader fileReader = new FileReader(new BufferedReader(new InputStreamReader(System.in)).readLine());
             FileWriter fileWriter = new FileWriter(new BufferedReader(new InputStreamReader(System.in)).readLine())) {

            int i;
            String data = "";

            while ((i = fileReader.read()) != -1) {
                data += (char) i;


            }
            ArrayList<BigDecimal> integers = new ArrayList<>();
            String[] dataSplit = data.split(" ");
            for (String s : dataSplit) {

                integers.addAll(Arrays.asList(new BigDecimal(Double.parseDouble(s)).setScale(0, RoundingMode.HALF_UP)));
            }
            integers.forEach(s -> {
                try {
                    fileWriter.write((s + " "));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });

        }


    }
}
