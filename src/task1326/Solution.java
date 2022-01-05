package task1326;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/*
Сортировка четных чисел из файла
*/

public class Solution {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
             Scanner scanner = new Scanner(new FileInputStream(bufferedReader.readLine()))) {
            while (scanner.hasNext()) {
                list.add(scanner.nextInt());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        List<Integer> a = list.stream().filter(x -> x % 2 == 0).sorted((o1, o2) -> o1 - o2).collect(Collectors.toList());
        a.forEach(System.out::println);
    }
}
