package task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые редкие байты
/home/masha/Desktop/txt.txt
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] date = new int[256];

        try (FileInputStream fileInputStream = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());) {
            while (fileInputStream.available() > 0) {
                date[fileInputStream.read()]++;
            }
            int maxCount = 1;
            for (int byteCount : date) {
                if (byteCount == maxCount) maxCount = byteCount;
            }
            ArrayList<Integer> resultList = new ArrayList<>();
            for (int i = 0; i < date.length; i++) {
                if (date[i] == maxCount) resultList.add(i);
            }
            for (Integer resultItem : resultList) System.out.print(resultItem + " ");
        }


        }




    }

