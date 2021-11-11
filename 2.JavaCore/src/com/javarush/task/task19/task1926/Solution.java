package com.javarush.task.task19.task1926;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Перевертыши
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader consoleRead = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader = new BufferedReader(new FileReader(consoleRead.readLine()));
        consoleRead.close();
        while (reader.ready()) {
            String tmp = reader.readLine();
            for (int i = tmp.length() - 1; i >= 0; i--) {
                System.out.print(tmp.toCharArray()[i]);
            }
            if (reader.ready())
                System.out.print("\n");
        }
        reader.close();
    }
}
