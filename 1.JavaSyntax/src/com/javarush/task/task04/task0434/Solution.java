package com.javarush.task.task04.task0434;

/* 
Таблица умножения Ӏ Java Syntax: 4 уровень, 10 лекция
*/

public class Solution {
    public static void main(String[] args) {
        int i = 1, k = 1, j = i % 10;
        while (k <= 10){
            while (j <= 10) {
                i = k * j;
                System.out.print(i + " ");
                j++;
            }
            j = 1;
            if (k == 10)
                break;
            k++;
            System.out.println();
        }
    }
}
