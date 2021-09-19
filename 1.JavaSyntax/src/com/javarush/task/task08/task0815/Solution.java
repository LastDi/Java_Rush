package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Иванов", "Иван");
        map.put("Петров", "Иван");
        map.put("Петров", "Петр");
        map.put("Иванов", "Петр");
        map.put("Димов", "Дима");
        map.put("Валентинов", "Валентин");
        map.put("Иоан", "Микоян");
        map.put("Индред", "Бергер");
        map.put("Иосиф", "Сталин");
        map.put("Иоганн", "Гете");
        map.put("Иоган", "Иогон");
        map.put("Ауф", "Волк");
        map.put("Иванов", "Влад");
        return map;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        int count = 0;
        while (iterator.hasNext()){
            Map.Entry<String, String> pair = iterator.next();
            String s = pair.getValue();
            if (s.equals(name)){
                count++;
            }
        }
        return count;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        int countLast = 0;
        while (iterator.hasNext()){
            Map.Entry<String, String> pair = iterator.next();
            String s = pair.getKey();
            if (s.equals(lastName)){
                countLast++;
            }
        }
        return countLast;

    }

    public static void main(String[] args) {

    }
}
