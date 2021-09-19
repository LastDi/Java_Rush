package com.javarush.task.task01.task0133;

/* 
Не думать о секундах…
*/

public class Solution {
    public static void main(String[] args) {
        int secondsAfter15 = 0;
        System.out.println(seconds(15, 30));
    }
    public static int seconds(int hours, int min){
        int c = ((hours - 15)*60 + min)*60;
        return c;
    }
}