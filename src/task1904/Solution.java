package com.javarush.task.task19.task1904;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) throws IOException, ParseException {



    }

    public static class PersonScannerAdapter implements PersonScanner {
        private Scanner fileScanner;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MM yyyy", Locale.ENGLISH);


        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException, ParseException {
            String data = fileScanner.nextLine();
            String[] result = data.split(" ");
            String resultDate = result[3] + " " + result[4] + " " + result[5];
            Date date = simpleDateFormat.parse(resultDate);
            //Иванов Иван Иванович 31 12 1950
            return new Person(result[1], result[2], result[0], date);
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
