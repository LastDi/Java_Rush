package com.javarush.task.task03.task0303;

/* 
Обмен валют
*/

public class Solution {
    public static void main(String[] args) {
        double a = convertEurToUsd(6, 2);
        double b = convertEurToUsd(6, 3);//напишите тут ваш код
        System.out.println(a);
        System.out.println(b);
    }

    public static double convertEurToUsd(int eur, double course) {
        double convertEurToUsd = eur*course;
        return convertEurToUsd;//напишите тут ваш код

    }
}
