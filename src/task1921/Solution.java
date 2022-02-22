package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.*;
import java.util.regex.Pattern;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(args[0]))) {
            String line;
            String resultName;
            String[] dataTime;
            String[] dataName;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MM yyyy");
            Date date;
            while ((line = bufferedReader.readLine()) != null) {
                dataTime = line.split(" ");
                dataName = line.split("\\d|-");
                resultName = dataName[0].toString().trim();
                date = simpleDateFormat.parse(dataTime[dataTime.length - 3] + " " + dataTime[dataTime.length - 2]  + " " + dataTime[dataTime.length - 1]);
                PEOPLE.add(new Person(resultName, date));

            }


        } catch (FileNotFoundException e) {
            System.out.println("файл не найден");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(PEOPLE.get(0));
        System.out.println(PEOPLE.get(1));
        System.out.println(PEOPLE.get(2));

    }
}
