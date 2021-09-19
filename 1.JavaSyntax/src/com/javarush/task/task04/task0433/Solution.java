package com.javarush.task.task04.task0433;

/* 
Гадание на долларовый счет
*/

public class Solution {
    public static void main(String[] args) {
        int i = 0, j = 0;
        while (i < 10){
            i++;
            while (j < 10){
                System.out.print("S");
                j++;
            }
            j = 0;
            if (i == 10){
                break;
            }
            System.out.println();
        }

    }
}
