package com.javarush.task.task18.task1818;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        try (FileOutputStream fileOutputStream = new FileOutputStream(new BufferedReader(new InputStreamReader(System.in), 200).readLine(), true);
             FileInputStream fileInputStreamOne = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
             FileInputStream fileInputStreamTwo = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine())) {

            int i;
            int a;
            while ((i = fileInputStreamOne.read()) != -1) {
                fileOutputStream.write(i);
            }
            while ((a = fileInputStreamTwo.read()) != -1) {
                fileOutputStream.write(a);
            }
        }

    }
}
