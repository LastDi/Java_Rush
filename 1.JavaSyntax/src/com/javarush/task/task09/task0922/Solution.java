package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        String date = reader.readLine();
        Date date1 = dateFormat.parse(date);
        SimpleDateFormat df = new SimpleDateFormat("MMM dd, yyy", Locale.ENGLISH);
        System.out.println(df.format(date1).toUpperCase(Locale.ROOT));



    }
}
