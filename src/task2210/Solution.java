package com.javarush.task.task22.task2210;

import java.util.Arrays;
import java.util.StringTokenizer;

/* 
StringTokenizer
*/

public class Solution {
    public static void main(String[] args) {

        System.out.println(getTokens("level22.lesson13.task01", "."));
    }

    public static String getTokens(String query, String delimiter) {
        StringTokenizer tokenizer = new StringTokenizer(query, delimiter);
        String[] result = new String[tokenizer.countTokens()];
        while (tokenizer.hasMoreTokens()) {
            result[(tokenizer.countTokens() * -1) + 3] = String.format("%s", tokenizer.nextToken());

        }

        return Arrays.toString(result);
    }

}
