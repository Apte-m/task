package com.javarush.task.task22.task2203;

/*
Между табуляциями
*/

public class Solution {
    public static String getPartOfString(String string) throws TooShortStringException {
        int count = 0;
        if (string == null) {
            throw new TooShortStringException();
        }
        for (char tabulation : string.toCharArray()) {
            if ("\t".equals("" + tabulation)) {
                count++;

            }
        }
        if (count < 3) {
            throw new TooShortStringException();
        }
        String[] splitWord = string.split("\\t");
        return splitWord[1];
    }

    public static class TooShortStringException extends Exception {
    }

    public static void main(String[] args) throws Exception {
        System.out.println(getPartOfString("\tJavaRush - лучший сервис \tобучения Java\t."));
    }
}