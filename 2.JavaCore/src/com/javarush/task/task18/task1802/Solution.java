package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String fileName = read.readLine();
        read.close();
        FileInputStream input = new FileInputStream(fileName);
        int minByte = -1;
        while (input.available() > 0) {
            int data = input.read();
            if (minByte == -1) {
                minByte = data;
            }
            if (data < minByte) {
                minByte = data;
            }
        }
        input.close();
        System.out.println(minByte);
    }
}
