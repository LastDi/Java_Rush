package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] maxnum = new int[20];
        int[] num1 = new int[10];
        int[] num2 = new int[10];

        for (int i = 0; i < maxnum.length; i++) {
            maxnum[i] = Integer.parseInt(reader.readLine());
        }
        for (int i = 0; i < maxnum.length / 2; i++) {
            num1[i] = maxnum[i];
        }
        for (int i = 0; i < maxnum.length / 2; i++) {
            num2[i] = maxnum[maxnum.length / 2 + i];
        }
        for (int i = 0; i < num2.length; i++) {
            System.out.println(num2[i]);
        }
    }
}
