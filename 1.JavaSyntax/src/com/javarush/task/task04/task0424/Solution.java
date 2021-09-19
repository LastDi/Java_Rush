package com.javarush.task.task04.task0424;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Три числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int count = 1;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int s1 = count++;
        int b = Integer.parseInt(reader.readLine());
        int s2 = count++;
        int c = Integer.parseInt(reader.readLine());
        int s3 = count++;

        if (a != b && a != c && b == c)
            System.out.println(s1);
        else if (b != a && b != c && a == c)
            System.out.println(s2);
        else if (c != a && c != b && a == b)
            System.out.println(s3);

    }
}
