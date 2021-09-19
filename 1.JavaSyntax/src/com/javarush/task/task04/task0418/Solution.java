package com.javarush.task.task04.task0418;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Минимум двух чисел Ӏ Java Syntax: 4 уровень, 6 лекция
*/

public class Solution {
    public static void main(String[] args) throws Exception {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    int num1 = Integer.parseInt(reader.readLine());
    int num2 = Integer.parseInt(reader.readLine());

    if (num1 < num2)
        System.out.println(num1);
    else System.out.println(num2);

    }
}