package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String fileName = read.readLine();
        read.close();
        FileInputStream input = new FileInputStream(fileName);
        int maxByte = 0;
        while (input.available() > 0) {
            int data = input.read();
            if (data > maxByte) {
                maxByte = data;
            }
        }
        input.close();
        System.out.println(maxByte);
    }
}
