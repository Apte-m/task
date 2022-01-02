package com.javarush.task.task19.task1907;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import static java.lang.System.*;


/* 
Считаем слово
Считаем слово
Считать с консоли имя файла.
Файл содержит слова, разделенные знаками препинания.
Вывести в консоль количество слов "world", которые встречаются в файле.
Закрыть потоки.


Requirements:
1. Программа должна считывать имя файла с консоли (используй BufferedReader).
2. BufferedReader для считывания данных с консоли должен быть закрыт.
3. Программа должна считывать содержимое файла (используй FileReader c конструктором принимающим String).
4. Поток чтения из файла (FileReader) должен быть закрыт.
5. Программа должна выводить в консоль количество слов "world", которые встречаются в файле.
*/

public class Solution {


    public static void main(String[] args) throws IOException {
        String[] data;
        int count = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        FileReader fileReader = new FileReader(reader.readLine());
        Scanner scanner = new Scanner(fileReader);


        while (fileReader.ready()) {
            String input = scanner.nextLine()
                    .replaceAll("\\W"," ")
                    .replaceAll("\\s", " ")
                    .replaceAll("\\n"," ")
                    .replaceAll("\\p{Punct}"," ");
            data = input.split(" ");
            for (String result : data) {
                if (result.equals("world")) {
                    count++;

                }

            }
        }
        reader.close();
        fileReader.close();
        out.println(count);

    }
}
