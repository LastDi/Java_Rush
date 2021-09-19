package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> strings = new ArrayList<>();
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            strings.add(read.readLine());
        }
        int m = strings.get(0).length();
        for (int i = 1; i < 5; i++) {
            if (strings.get(i).length() < m)
                m = strings.get(i).length();
        }
        for (int i = 0; i < 5; i++) {
            if (strings.get(i).length() <= m)
                System.out.println(strings.get(i));
        }
    }
}
