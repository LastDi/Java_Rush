package com.javarush.task.task08.task0817;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Иванов", "Иван");
        map.put("Петров", "Иван");
        map.put("Долгов", "Дима");
        map.put("Многов", "Дима");
        map.put("Коробов", "Вася");
        map.put("Простов", "Петя");
        map.put("Лотов", "Кугур");
        map.put("Ков", "Даздраперма");
        map.put("Пов", "Мэлс");
        map.put("Тов", "Йоху");
        return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        Map<String, String> copy = new HashMap<>(map);
        Iterator<Map.Entry<String, String>> iterator = copy.entrySet().iterator();
        for (Map.Entry pair1 : copy.entrySet()) {
            for (Map.Entry pair2 : copy.entrySet()) {
                if (pair1.getValue().equals(pair2.getValue()) && !pair1.getKey().equals(pair2.getKey())) {
                    removeItemFromMapByValue(map, (String) pair1.getValue());
                }
            }
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {

    }
}
