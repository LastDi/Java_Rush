package com.javarush.task.task04.task0419;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Максимум четырех чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

       int num1 = Integer.parseInt(reader.readLine());
       int num2 = Integer.parseInt(reader.readLine());
       int num3 = Integer.parseInt(reader.readLine());
       int num4 = Integer.parseInt(reader.readLine());
       int max, max1, max2;

       if (num1 > num2)
           max1 = num1;
       else
           max1 = num2;

       if (num3 > num4)
           max2 = num3;
       else
           max2 = num4;

       if (max1 > max2)
           max = max1;
       else
           max = max2;

        System.out.println(max);


    }
}
