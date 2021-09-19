package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        Map<String, Integer> map = new HashMap<>();
        map.put("Иванов", 10);
        map.put("Петров", 100);
        map.put("Голько", 501);
        map.put("Ролов", 200);
        map.put("Гудок", 300);
        map.put("Челик", 1000);
        map.put("Норм", 204);
        map.put("Гордон", 304);
        map.put("Нормичев", 2134);
        map.put("Ластец", 9876);
        return map;
    }
    public static void removeItemFromMap(Map<String, Integer> map) {
        Map<String, Integer> map1 = map;
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();

        while (iterator.hasNext())
        {
            Map.Entry<String, Integer> pair = iterator.next();
            Integer value = pair.getValue();
            if (value < 500)
            iterator.remove();
        }
    }

    public static void main(String[] args) {

    }
}