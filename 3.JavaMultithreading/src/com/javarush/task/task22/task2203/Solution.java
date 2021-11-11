package com.javarush.task.task22.task2203;

/* 
Между табуляциями
*/

public class Solution {
    public static String getPartOfString(String string) throws TooShortStringException {
        int begin = 0;
        int end = 0;
        if (string != null) {
            begin = string.indexOf('\t');
            end = string.indexOf('\t', begin + 1);
        }
        if (end <= 0) {
            throw new TooShortStringException();
        }
        else
            return string.substring(begin + 1, end);
    }

    public static class TooShortStringException extends Exception {

    }

    public static void main(String[] args) throws TooShortStringException {
        System.out.println(getPartOfString("\tJavaRush - л\tучший сервис \tобучения Java\t."));
    }
}
