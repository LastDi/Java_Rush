package com.javarush.task.task04.task0429;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Положительные и отрицательные числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int posCount = 0, negCount = 0;
        if (a > 0)
            posCount++;
        else if(a < 0)
            negCount++;
        if (b > 0)
            posCount++;
        else if(b < 0)
            negCount++;
        if (c > 0)
            posCount++;
        else if(c < 0)
            negCount++;
        System.out.println("количество отрицательных чисел: " + negCount);
        System.out.println("количество положительных чисел: " + posCount);
    }
}
