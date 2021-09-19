package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        for (String word : string.split("\\b")) {
            System.out.print(word.substring(0, 1).toUpperCase() + word.substring(1));
        }
        /*System.out.println(string.substring(0, 1).toUpperCase() + string.substring(1, 5) +
                string.substring(5, 6).toUpperCase() + string.substring(6, 10) +
                string.substring(10, 11).toUpperCase() + string.substring(11));

         */
    }
}
