package com.javarush.task.task03.task0325;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Финансовые ожидания
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String text = reader.readLine();
        int m = Integer.parseInt(text);

        System.out.println("Я буду зарабатывать $" + m + " в час");//напишите тут ваш код

    }
}
