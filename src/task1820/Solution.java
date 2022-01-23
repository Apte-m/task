package com.javarush.task.task18.task1820;

import java.io.*;
import java.math.BigDecimal;
import java.math.RoundingMode;

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

            String[] dataSplit = data.split(" ");
            for (String s : dataSplit) {
                fileWriter.write((new BigDecimal(Double.parseDouble(s)).setScale(0, RoundingMode.HALF_UP)) + " ");

            }


        }


    }
}
