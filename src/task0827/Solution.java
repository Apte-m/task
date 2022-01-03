package task0827;

import java.text.SimpleDateFormat;
import java.util.Date;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("January 1 2013"));
    }

    public static boolean isDateOdd(String date) {
//        String[] input = date.split(" ");
//        return Integer.parseInt(input[1]) % 2 == 0 || Integer.parseInt(input[1]) == 1 ? true : false;
        Date data = new Date(date);
        SimpleDateFormat format = new SimpleDateFormat("D");
        return Integer.parseInt(format.format(data)) % 2 != 0;

    }
}
