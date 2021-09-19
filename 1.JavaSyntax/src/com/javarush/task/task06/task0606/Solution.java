package com.javarush.task.task06.task0606;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(reader.readLine());
        int j = 0;
        while (i > 0) {
            j = i % 10;
            if (j % 2 == 0)
                even++;
            else
                odd++;
            i = i/10;
        }
        System.out.println("Even: " + even + " Odd: " + odd);

    }
}
