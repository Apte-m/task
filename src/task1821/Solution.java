package com.javarush.task.task18.task1821;

import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

/* 
Встречаемость символов
/home/masha/Desktop/txt.txt

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (
                FileInputStream fileInputStream = new FileInputStream(args[0]);
        ) {
            int[] result = new int[256];
            while ((fileInputStream.available()) > 0) {
                int i = fileInputStream.read();
                result[i]++;
            }

            for (int i = 0; i < result.length; i++) {
                if (result[i] != 0) {
                    System.out.println((char) i + " " + result[i]);
                }
            }
        }


    }


}
