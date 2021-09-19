package com.javarush.task.task04.task0441;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Как-то средненько
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int med, max, min;

        if ((a <= b && a >= c) || (a >= b && a <= c))
            med = a;
        else if ((b <= a && b >= c) || (b >= a && b <= c))
            med = b;
        else if ((c <= b && c >= a) || (c >= b && c <= a))
            med = c;
        else {
            med = c;
        }

        System.out.println(med);
    }
}
