package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleMap();
        printPeopleMap(map);
    }

    public static Map<String, String> createPeopleMap() {
        Map<String, String> map1 = new HashMap<>();
        map1.put("Иванов", "Алексей");
        map1.put("Петров", "Алексей");
        map1.put("Иванов", "Антонио");
        map1.put("Петров", "Влад");
        map1.put("Иванов", "Булат");
        map1.put("Долгов", "Алексей");
        map1.put("Буйнов", "Алексей");
        map1.put("Иванов", "Иван");
        map1.put("Петров", "Иван");
        map1.put("Иванов", "Леха");
        return map1;
    }

    public static void printPeopleMap(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
