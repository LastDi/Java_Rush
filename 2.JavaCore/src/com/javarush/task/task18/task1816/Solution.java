package com.javarush.task.task18.task1816;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* 
Английские буквы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream input = new FileInputStream(args[0]);
        int count = 0;
        while (input.available() > 0) {
            int data = input.read();
            if ((data >= 65 && data <= 90) || (data >= 97 && data <= 122)) {
                count++;
            }
        }
        System.out.println(count);
        input.close();
    }
}
