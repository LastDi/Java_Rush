package com.javarush.task.task05.task0532;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Задача по алгоритмам Ӏ Java Syntax: 5 уровень, 12 лекция
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = Integer.MIN_VALUE; // минимально возможное число
        int N = Integer.parseInt(reader.readLine());
        for (int i = 0; i < N; i++) { //цикл с получением переменной и сравнением ее с текущим значением максимума
            int M = Integer.parseInt(reader.readLine());
            if (M > maximum){
                maximum = M;
            }
        }
        if (N > 0) // если отрицательно, то ничего не выводим
        System.out.println(maximum);
    }
}
