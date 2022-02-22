package com.javarush.task.task19.task1919;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

/* 
Считаем зарплаты
/home/masha/Desktop/txt.txt
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        Map<String, Double> stringIntegerMap = new TreeMap();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(args[0]))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                StringTokenizer str = new StringTokenizer(line, " ");
                String name = str.nextToken();
                Double value = Double.valueOf(str.nextToken());


                if (stringIntegerMap.containsKey(name)) {
                    Double getValue = stringIntegerMap.get(name);
                    stringIntegerMap.put(name, getValue + value);
                } else {
                    stringIntegerMap.put(name, value);
                }

            }
        } catch (FileNotFoundException e) {
            System.out.println("файл не найден");
        }
        stringIntegerMap.entrySet().forEach(v -> {
            System.out.println(v.getKey() + " " + v.getValue());
        });

    }
}
