package com.javarush.task.task04.task0412;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Положительное и отрицательное число
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sNum = reader.readLine();
        int num = Integer.parseInt(sNum);
        if (num > 0){
            num = num * 2;//напишите тут ваш код
        }
        else if (num < 0){
            num = num + 1;
        }
        System.out.println(num);
    }

}