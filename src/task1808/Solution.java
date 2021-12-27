package task1808;

import java.io.*;

/* 
Разделение файла
Считать с консоли три имени файла: файл1, файл2, файл3.
Разделить файл1 по следующему критерию:
Первую половину байт записать в файл2, вторую половину байт записать в файл3.
Если в файл1 количество байт нечетное, то файл2 должен содержать большую часть.
Закрыть потоки.


Requirements:
1. Программа должна три раза считать имена файлов с консоли.
2. Для чтения из файла используй поток FileInputStream, для записи в файлы - FileOutputStream
3. Первую половину байт из первого файла нужно записать во второй файл.
4. Вторую половину байт из первого файла нужно записать в третий файл.
5. Потоки FileInputStream и FileOutputStream должны быть закрыты.
*/

public class Solution {
    public static int fileHalf;
    public static int numberOfByte;

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = new String[3];
        for (int i = 0; i < 3; i++) {
            input[i] = reader.readLine();
        }
        try (FileInputStream fileInputStreamOne = new FileInputStream(input[0]);
             FileOutputStream fileOutputStreamOne = new FileOutputStream(input[1]);
             FileOutputStream fileOutputStreamTwo = new FileOutputStream(input[2]);) {

            fileHalf = (fileInputStreamOne.available() + 1) / 2;
            numberOfByte = 0;
            while (fileInputStreamOne.available() > 0) {
                if (fileHalf > numberOfByte) {
                    fileOutputStreamOne.write(fileInputStreamOne.read());
                    numberOfByte++;
                } else {
                    fileOutputStreamTwo.write(fileInputStreamOne.read());
                }
            }

        }
    }

}

