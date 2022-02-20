package com.javarush.task.task18.task1823;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/*
Нити и байты
/home/masha/Desktop/txt.txt
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap();

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while (!(line = bufferedReader.readLine()).equals("exit")) {
            new ReadThread(line).start();
        }


    }

    public static class ReadThread extends Thread {
        private String fileName;

        public ReadThread(String fileName) {
            this.fileName = fileName;
        }

        @Override
        public void run() {
            int data[] = new int[256];
            try (FileInputStream fileInputStream = new FileInputStream(fileName)) {
                while (fileInputStream.available() > 0) {
                    int i = fileInputStream.read();
                    data[i]++;
                }

            } catch (IOException e) {
                System.out.println("нет файла");
            }
            int index = 0;
            int max = 0;
            for (int i = 0; i < data.length; i++) {
                if (data[i] > max) {
                    max = data[i];
                    index = i;
                }
            }
            resultMap.put(fileName, index);
            System.out.println(resultMap);

        }


    }
}
