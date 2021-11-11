package com.javarush.task.task22.task2212;

/* 
Проверка номера телефона
*/

import java.util.regex.Pattern;

public class Solution {
    public static boolean checkTelNumber(String telNumber) {
        if (telNumber == null)
            return false;
        else if ((telNumber.matches("^\\+(\\d[()]?){12}$") || telNumber.matches("^([()]?\\d){10}$"))
                && telNumber.matches("^(\\+)?(\\d+)?(\\(\\d{3}\\))?\\d+$"))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
    }
}
