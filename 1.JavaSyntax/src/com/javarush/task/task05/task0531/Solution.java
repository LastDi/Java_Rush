package com.javarush.task.task05.task0531;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Совершенствуем функциональность
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int e = Integer.parseInt(reader.readLine());

        int minimum = min(a, b, c, e, d);

        System.out.println("Minimum = " + minimum);
    }


    public static int min(int a, int b, int c, int e, int d) {
        int minimum = b;
        int minimum1 = d;
        if (a < b)
            minimum = a;
        if (c < d)
            minimum1 = c;
        if (minimum1 < minimum)
            minimum = minimum1;
        if (e < minimum)
            minimum = e;
        return minimum;


    }
}
