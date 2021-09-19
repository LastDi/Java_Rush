package com.javarush.task.task08.task0802;

import java.util.HashMap;
import java.util.Map;

/* 
Map из 10 пар
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> spisok = new HashMap<String, String>();
        spisok.put("арбуз", "ягода");
        spisok.put("банан", "трава");
        spisok.put("вишня", "ягода");
        spisok.put("груша", "фрукт");
        spisok.put("дыня", "овощ");
        spisok.put("ежевика", "куст");
        spisok.put("жень-шень", "корень");
        spisok.put("земляника", "ягода");
        spisok.put("ирис", "цветок");
        spisok.put("картофель", "клубень");

        for (Map.Entry<String, String> pair : spisok.entrySet()){
            String key = pair.getKey();
            String value = pair.getValue();
            System.out.println(key + " - " + value);
        }

    }
}
