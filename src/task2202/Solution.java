package task2202;

/*
Найти подстроку
*/

public class Solution {
    public static void main(String[] args) {
        try {
            System.out.println(getPartOfString("JavaRush - лучший сервис обучения Java."));
        } catch (TooShortStringException e) {
            e.printStackTrace();
        }
    }

    public static String getPartOfString(String string) throws TooShortStringException {
        if (string == null) {
            throw new TooShortStringException();
        }

        String[] result = string.split(" ");

        if (result.length < 5) {
            throw new TooShortStringException();
        }

        return result[1] + " " + result[2] + " " + result[3] + " " + result[4];


    }

    public static class TooShortStringException extends RuntimeException {
    }
}
