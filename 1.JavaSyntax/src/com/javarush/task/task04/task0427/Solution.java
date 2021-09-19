package com.javarush.task.task04.task0427;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Описываем числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int age = Integer.parseInt(reader.readLine());

        if (age > 0 && age < 1000) {
            if ((age / 100) == 0) {
                if ((age / 10) == 0) {
                    if (age % 2 == 0)
                        System.out.println("четное однозначное число");
                    else
                        System.out.println("нечетное однозначное число");
                } else if (age % 2 == 0)
                    System.out.println("четное двузначное число");
                else
                    System.out.println("нечетное двузначное число");
            } else if (age % 2 == 0)
                System.out.println("четное трехзначное число");
            else
                System.out.println("нечетное трехзначное число");
        }
    }
}
