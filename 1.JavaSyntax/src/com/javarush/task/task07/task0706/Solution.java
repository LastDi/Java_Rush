package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] generalnums = new int[15];
        int[] evennums = new int[generalnums.length / 2 + generalnums.length % 2];
        int[] oddnums = new int[generalnums.length / 2];
        int evensum = 0;
        int oddsum = 0;

        for (int i = 0; i < generalnums.length; i++) {
            generalnums[i] = Integer.parseInt(reader.readLine());
        }
        for (int i = 0; i < evennums.length; i++) {
            evennums[i] = generalnums[i*2];
            evensum += evennums[i];
        }
        for (int i = 0; i < oddnums.length; i++) {
            oddnums[i] = generalnums[i*2 + 1];
            oddsum += oddnums[i];
        }

        if (oddsum > evensum)
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        else
            System.out.println("В домах с четными номерами проживает больше жителей.");
    }
}
