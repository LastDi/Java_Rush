package com.javarush.task.task08.task0827;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) throws ParseException {
        System.out.println(isDateOdd("JANUARY 2 2013"));
    }

    public static boolean isDateOdd(String date) throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMM dd yyyy", Locale.ENGLISH);
        Date date1 = dateFormat.parse(date);
        Date yearStartTime = dateFormat.parse(date);
        yearStartTime.setHours(0);
        yearStartTime.setMinutes(0);
        yearStartTime.setSeconds(0);
        yearStartTime.setDate(1);
        yearStartTime.setMonth(0);
        long msYear = date1.getTime();
        long msYearStartTime = yearStartTime.getTime();
        long ms = msYear - msYearStartTime;
        long msDay = 24 * 60 * 60 * 1000;
        long dayCount = ms / msDay;
        System.out.println(ms);
        System.out.println(yearStartTime);
        System.out.println(date1);
        if ( dayCount  % 2 == 0)
            return true;
        else
        return false;
    }
}
