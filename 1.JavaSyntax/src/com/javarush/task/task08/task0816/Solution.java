package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Смирнов", dateFormat.parse("MAY 1 2012"));
        map.put("Иванов", dateFormat.parse("JUNE 1 2012"));
        map.put("Петров", dateFormat.parse("JULY 1 2012"));
        map.put("Абубаков", dateFormat.parse("AUGUST 1 2012"));
        map.put("Смарков", dateFormat.parse("MAY 1 2012"));
        map.put("Лотков", dateFormat.parse("MAY 1 2012"));
        map.put("Приколов", dateFormat.parse("SEPTEMBER 1 2012"));
        map.put("Пантон", dateFormat.parse("MAY 1 2012"));
        map.put("Хакатонов", dateFormat.parse("OCTOBER 1 2012"));
        map.put("Хабров", dateFormat.parse("MAY 1 2012"));
        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()){
            Map.Entry<String, Date> pair = iterator.next();
            Date date = pair.getValue();
            if (date.getMonth() > 4 && date.getMonth() < 8)
                iterator.remove();
        }
    }

    public static void main(String[] args) {

    }
}
