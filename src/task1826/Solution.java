package com.javarush.task.task18.task1826;

import java.io.*;
import java.security.NoSuchAlgorithmException;

/* 
Шифровка
/home/masha/Desktop/txt.txt
*/

public class Solution {
    public static void main(String[] args) throws IOException, NoSuchAlgorithmException {
        BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(args[1]));
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(args[2]));

        switch (args[0]) {
            case "-e":
                while (inputStream.available() > 0) {
                    bufferedOutputStream.write(inputStream.read() + 1);
                }
                break;
            case "-d":
                while (inputStream.available() > 0) {
                    bufferedOutputStream.write(inputStream.read()  - 1);
                }
                break;
        }
        inputStream.close();
        bufferedOutputStream.close();

    }


}


