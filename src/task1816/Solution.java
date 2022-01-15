package com.javarush.task.task18.task1816;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/* 
Английские буквы
/home/masha/Desktop/txt.txt
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        try (FileReader fileReader = new FileReader(args[0])) {
            int i;
            int letterCount = 0;
            while ((i = fileReader.read()) != -1) {
                char item = (char) i;
                if (item >= 'a' && item <= 'z' || item >= 'A' && item <= 'Z') {
                    letterCount++;
                }

            }
            System.out.println(letterCount);
        }


    }
}
