package com.javarush.task.task18.task1822;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Поиск данных внутри файла
/home/masha/Desktop/txt.txt
*/

public class Solution {
    public static void main(String[] args) {
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new FileReader(new BufferedReader(new InputStreamReader(System.in), 200).readLine()));
            ArrayList<String> strings = new ArrayList<>();
            while (bufferedReader.ready()) {
                String line = bufferedReader.readLine();
                strings.add(line);
            }
            strings.forEach(v -> {
                String data[] = v.split(" ");
                if (data[0].equals(String.valueOf(args[0]))) {
                    System.out.println(v);
                }
            });
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("Нет файла");
        }


    }
}
