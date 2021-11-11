package com.javarush.task.task19.task1909;

import java.io.*;
import java.util.ArrayList;

/* 
Замена знаков
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String firstFile = bufferedReader.readLine();
        String secondFile = bufferedReader.readLine();
        bufferedReader.close();
        BufferedReader reader = new BufferedReader(new FileReader(firstFile));
        String text = reader.readLine();
        reader.close();
        BufferedWriter writer = new BufferedWriter(new FileWriter(secondFile));
        char[] textChar = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            textChar[i] = text.charAt(i);
        }
        for (int i = 0; i < textChar.length; i++) {
            if (textChar[i] == '.') {
                textChar[i] = '!';
            }
        }
        writer.write(textChar);
        writer.close();
    }
}
