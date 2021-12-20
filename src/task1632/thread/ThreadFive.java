package com.javarush.task.task16.task1632.thread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThreadFive extends Thread {
    public void run() {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int number = 0;
            while (true) {
                String string = reader.readLine();
                if (string.equals("N")) break;
                number += Integer.parseInt(string);
            }
            reader.close();
            System.out.println(number);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

