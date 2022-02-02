package com.javarush.task.task22.task2208;

import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

/* 
Формируем WHERE
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("name", "Ivanov");
        map.put("country", "Ukraine");
        map.put("city", "Kiev");
        map.put("age", null);

        System.out.println(getQuery(map));
    }


    public static String getQuery(Map<String, String> params) {
        StringJoiner builder = new StringJoiner(" and ");

        params.entrySet().stream().filter(v -> v.getValue() != null)
                .forEach(v -> builder.add(String.format("%s = '%s'", v.getKey(), v.getValue())));

        return builder.toString();
    }
}
