package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самая длинная строка
*/

public class Solution {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        strings = new ArrayList<>();
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            strings.add(read.readLine());
        }
        int m = strings.get(0).length();
        for (int i = 1; i < 5; i++) {
            if (strings.get(i).length() > m)
                m = strings.get(i).length();
        }
        for (int i = 0; i < 5; i++) {
            if (strings.get(i).length() >= m)
                System.out.println(strings.get(i));
        }
    }
}
