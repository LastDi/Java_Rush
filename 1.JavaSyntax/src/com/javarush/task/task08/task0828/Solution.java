package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String dateStr = reader.readLine();
        Map<String, Integer> map = new HashMap<>();
        map.put("January", 1);
        map.put("February", 2);
        map.put("March", 3);
        map.put("April", 4);
        map.put("May", 5);
        map.put("June", 6);
        map.put("July", 7);
        map.put("August", 8);
        map.put("September", 9);
        map.put("October", 10);
        map.put("November", 11);
        map.put("December", 12);

        for (Map.Entry<String, Integer> date: map.entrySet()) {
            if (dateStr.equals(date.getKey())){
                System.out.println(date.getKey() + " is the " + date.getValue() + " month");
            }
        }





        /* SimpleDateFormat formatter = new SimpleDateFormat("MMMM", Locale.ENGLISH);
        int x = 0;
        try {
            Date date = formatter.parse(dateStr);
            System.out.println(formatter.format(date));
            x = date.getMonth();
        }
        catch (ParseException e){
            e.printStackTrace();
        }
        x = x + 1;
        System.out.println(dateStr + " is the " + x + " month");
    }

         */
    }
}
