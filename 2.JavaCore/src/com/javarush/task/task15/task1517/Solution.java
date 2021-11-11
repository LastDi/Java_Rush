package com.javarush.task.task15.task1517;

/* 
Статики и исключения
*/

public class Solution {
    public static int A = 0;

    static {
        if (0 == 0) {
            throw new RuntimeException();
        }
    }

    public static int B = 5;

    public static void main(String[] args) throws RuntimeException{
        System.out.println(B);
    }
}
