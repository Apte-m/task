package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Самые частые байты
/home/masha/Desktop/txt.txt

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream fileInputStream = new FileInputStream(reader.readLine());) {
            int b = -1;

            List<Byte> list = new ArrayList<>();
            Map<Integer, Byte> map = new HashMap<>();
            while ((b = fileInputStream.read()) != -1) {
                list.add((byte) b);
                map.put(Collections.frequency(list, (byte) b), (byte) b);

            }

            System.out.println(list);
            System.out.println(map);
        }

    }
}



