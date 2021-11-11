package com.javarush.task.task14.task1420;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
НОД
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(reader.readLine());
        int y = Integer.parseInt(reader.readLine());
        int max;
        if (x > y)
            max = x;
        else
            max = y;
        int nod = max - 1;
        while (nod > 0) {
            if ((x % nod) == 0 && (y % nod) == 0)
                break;
            nod--;
        }
        System.out.println(nod);
    }
}
