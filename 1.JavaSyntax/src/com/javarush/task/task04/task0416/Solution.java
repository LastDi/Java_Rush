package com.javarush.task.task04.task0416;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переходим дорогу вслепую
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double s = Double.parseDouble(reader.readLine());
        double m = s % 5;
        if (m >= 0 && m < 3){
            System.out.println("зелёный");
        }
        else if (m >= 3 && m < 4){
            System.out.println("жёлтый");
        }
        else {
            System.out.println("красный");
        }
    }
}