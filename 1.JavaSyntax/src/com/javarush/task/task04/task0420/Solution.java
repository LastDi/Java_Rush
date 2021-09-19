package com.javarush.task.task04.task0420;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Сортировка трех чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());
        int num3 = Integer.parseInt(reader.readLine());
        int max, med, min;

        if (num1 > num2) {
            max = num1;
            med = num2;
        }
        else {
            max = num2;
            med = num1;
        }
        if (num3 > max) {
            min = med;
            med = max;
            max = num3;
        }
        else if (num3 > med) {
            min = med;
            med = num3;
        }
        else min = num3;

        System.out.println(max + " " + med + " " + min);
        }
    }
