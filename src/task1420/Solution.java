package task1420;

import java.util.Scanner;

/* 
НОД
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scannerOne = new Scanner(System.in);
        Scanner scannerTwo = new Scanner(System.in);
        int a = scannerOne.nextInt();
        int b = scannerTwo.nextInt();

        System.out.println(GCD(a,b));

    }

    public static int GCD ( int a, int b){
        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        return a;
    }
}
