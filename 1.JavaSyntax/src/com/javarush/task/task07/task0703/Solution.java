package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] numbs = new int[10];
        String[] list = new String[10];
        for (int i = 0; i < list.length; i++) {
            list[i] = reader.readLine();
            numbs[i] = list[i].length();
        }
        for (int i = 0; i < numbs.length; i++) {
        System.out.println(numbs[i]);
        }
    }
}
