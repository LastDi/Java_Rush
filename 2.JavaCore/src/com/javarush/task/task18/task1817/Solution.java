package com.javarush.task.task18.task1817;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

/* 
Пробелы
*/

public class Solution {
    public static void main(String[] args) throws IOException, ArithmeticException{
        FileInputStream input = new FileInputStream(args[0]);
        int n2 = 0;
        int n1 = input.available();
        while (input.available() > 0) {
            int data = input.read();
            if (data == 32) {
                n2++;
            }
        }
        input.close();
        if (n2 != 0) {
            System.out.println(Math.round( (double) n2 / n1 * 10000)/100.00 );
        }
    }
}
