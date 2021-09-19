package com.javarush.task.task03.task0319;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Предсказание на будущее
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name = reader.readLine();
        String num1 = reader.readLine();
        String num2 = reader.readLine();
        int inum1 = Integer.parseInt(num1);
        int inum2 = Integer.parseInt(num2);

        System.out.println(name + " получает " + inum1 + " через " + inum2 + " лет.");//напишите тут ваш код

    }
}
