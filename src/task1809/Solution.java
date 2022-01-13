package com.javarush.task.task18.task1809;

import java.io.*;
import java.util.*;

/* 
Реверс файла
/home/masha/Desktop/txt.txt
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        try (FileInputStream fileInputStream = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
             FileOutputStream fileOutputStream = new FileOutputStream(new BufferedReader(new InputStreamReader(System.in)).readLine())) {
            Stack<Byte> byteStack = new Stack<>();

            while (fileInputStream.available() > 0) {
                // read from buffer
                byteStack.push((byte) fileInputStream.read());
            }

            while (!byteStack.empty()) {
                fileOutputStream.write(byteStack.pop());
            }

        }
    }
}

