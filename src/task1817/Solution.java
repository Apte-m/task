package com.javarush.task.task18.task1817;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

/* 
Пробелы
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        try (FileReader reader = new FileReader(args[0])) {
            int i;
            int countSpace = 0;
            int notCountSpace = 0;

            while ((i = reader.read()) != -1) {
                char item = (char) i;
                notCountSpace++;
                if (item == ' ') {
                    countSpace++;

                }

            }
            DecimalFormat decimalFormat = new DecimalFormat("#.##");
            double two = Double.valueOf(decimalFormat.format(((double) countSpace / (double) notCountSpace) * 100));
            System.out.println(two);

        }
    }
}
