package com.javarush.task.task19.task1925;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;
import java.util.StringTokenizer;

/* 
Длинные слова
/home/masha/Desktop/txt.txt
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(args[0]));
            String line;
            StringJoiner stringJoiner = new StringJoiner(",");
            StringTokenizer stringTokenizer;
            List<String> stringList = new ArrayList<>();
            while ((line = bufferedReader.readLine()) != null) {
                stringTokenizer = new StringTokenizer(line, " \n");
                while (stringTokenizer.hasMoreTokens()) {
                    stringList.add(stringTokenizer.nextToken());
                }
            }
            for (String s : stringList) {
                if (s.length() > 6) {
                    stringJoiner.add(s);
                }
            }

            bufferedReader.close();

            FileWriter fileWriter = new FileWriter(args[1]);
            fileWriter.write(stringJoiner.toString());
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}
