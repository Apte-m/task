package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
мама мыла раму.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();

        //напишите тут ваш код
        String[] split = string.trim().split("\\s+");

        String data = "";
        String result;
        String resultConvert;
        for (int i = 0; i < split.length; i++) {
            result = String.valueOf(split[i].charAt(0));
            resultConvert = String.valueOf(split[i].charAt(0)).toUpperCase();
            data += split[i].replaceFirst(result, resultConvert) + " ";
        }
        System.out.println(data);


    }
}
