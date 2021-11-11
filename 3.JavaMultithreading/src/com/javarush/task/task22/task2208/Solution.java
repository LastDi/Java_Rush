package com.javarush.task.task22.task2208;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* 
Формируем WHERE
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> params = new LinkedHashMap<>();
        params.put("name", "Ivanov");
        params.put("country", "Ukraine");
        params.put("city", "Kiev");
        params.put("age", null);
        System.out.println(getQuery(params));
        for (Map.Entry pair : params.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }

    public static String getQuery(Map<String, String> params) {
        StringBuilder str = new StringBuilder();
        int count = 0;
        for (Map.Entry<String, String>  pair : params.entrySet()) {
            String key = pair.getKey();
            String value = pair.getValue();
            if (value != null) {
                if (count != 0)
                    str.append(" and ");
                str.append(key);
                str.append(" = '");
                str.append(value);
                str.append("'");
            }
            count++;
        }
        return str.toString();
    }
}
