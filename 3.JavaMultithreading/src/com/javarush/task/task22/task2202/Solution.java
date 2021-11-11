package com.javarush.task.task22.task2202;

/* 
Найти подстроку
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getPartOfString("JavaRush - лучший сервис обучения"));
    }

    public static String getPartOfString(String string) {
        int begin = 0;
        int end = 0;
        int space5 = 0;
        int count = 1;
        if (string != null) {
            int space = string.indexOf(32);
            while (space != -1) {
                System.out.println(space);
                if (count == 1)
                    begin = space;
                if (count == 4)
                    end = space;
                if (count == 5)
                    space5 = space;
                space = string.indexOf(32, space + 1);
                count++;
            }
        }
        if (end != 0 && space5 == 0)
            return string.substring(begin + 1);
        else if (space5 != 0)
            return string.substring(begin + 1, space5);
        else
            throw new TooShortStringException();
    }

    public static class TooShortStringException extends RuntimeException {
    }
}
