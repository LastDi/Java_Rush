package com.javarush.task.task05.task0507;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Среднее арифметическое
*/

public class Solution {
    public static void main(String[] args) throws Exception {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int summ = 0, count = 0;
    while (true){
        int i = Integer.parseInt(reader.readLine());
        if (i == -1)
            break;
        count++;
        summ += i;
    }
        System.out.println((double)summ/count);
    }
}

