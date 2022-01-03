package com.javarush.task.task19.task1914;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Optional;

/* 
Решаем пример
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream stream = System.out;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(byteArrayOutputStream);
        System.setOut(printStream);
        testString.printSomething();
        String data = byteArrayOutputStream.toString();
        String[] resultTwo = byteArrayOutputStream.toString().split(" ");
        int result = 0;
        int first = Integer.parseInt(resultTwo[0]);
        int second = Integer.parseInt(resultTwo[2]);
        if (resultTwo[1].equals("+")) {
            result = first + second;
        } else if (resultTwo[1].equals("-")) {
            result = first - second;
        } else {
            result = first * second;
        }

        System.setOut(stream);
        System.out.println(data + "" + result);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

