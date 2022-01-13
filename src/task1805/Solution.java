package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

/* 
Сортировка байт
/home/masha/Desktop/txt.txt
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        try (FileInputStream fileInputStream = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());) {
            Set<Integer> integers = new TreeSet<>();
            while (fileInputStream.available() > 0) {
                integers.add(fileInputStream.read());
            }
            integers.forEach(result -> {
                System.out.print(result + " ");
            });

        }
    }
}
