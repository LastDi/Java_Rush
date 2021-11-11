package com.javarush.task.task19.task1910;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Пунктуация
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String firstFile = bufferedReader.readLine();
        String secondFile = bufferedReader.readLine();
        bufferedReader.close();
        BufferedReader reader = new BufferedReader(new FileReader(firstFile));
        String text = reader.readLine();
        reader.close();
        text = text.replaceAll("\\p{Punct}", "");
        BufferedWriter writer = new BufferedWriter(new FileWriter(secondFile));
        for (int i = 0; i < text.length(); i++) {
                writer.write(text.charAt(i));
        }
        writer.close();
    }
}
