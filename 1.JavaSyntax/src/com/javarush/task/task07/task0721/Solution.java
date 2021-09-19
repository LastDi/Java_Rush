package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] nums = new int[20];
        nums = getInts();
        int maximum = nums[0];
        int minimum = nums[0];
        for (int i = 1; i < 20; i++) {
            if (nums[i] < minimum)
                minimum = nums[i];
            if (nums[i] > maximum)
                maximum = nums[i];
        }
        System.out.print(maximum + " " + minimum);
    }

    public static int[] getInts() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] numsRare = new int[20];
        for (int i = 0; i < 20; i++) {
            numsRare[i] = Integer.parseInt(reader.readLine());
        }
        return numsRare;
    }
}
