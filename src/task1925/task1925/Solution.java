package com.javarush.task.task19.task1925;

import java.io.*;
import java.util.ArrayList;
import java.util.StringJoiner;
import java.util.StringTokenizer;

/*
Длинные слова
/home/masha/Desktop/txt.txt
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/home/masha/Desktop/txt.txt"));
            String line;
            StringJoiner stringJoiner = new StringJoiner(",");

            while ((line = bufferedReader.readLine()) != null) {
                StringTokenizer stringTokenizer = new StringTokenizer(line, "\\n ");
                while (stringTokenizer.hasMoreTokens()) {
                     String str = stringTokenizer.nextToken();
                    if (str.length() > 6)
                        stringJoiner.add(str);
                }


            }
            System.out.println(stringJoiner);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}
