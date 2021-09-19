package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String txt = reader.readLine();
        FileInputStream inputStream = new FileInputStream(txt);
        BufferedInputStream buffer = new BufferedInputStream(inputStream);
        while (buffer.available() > 0) {
            char s = (char) buffer.read();
            System.out.print(s);
        }
        reader.close();
        buffer.close();
        inputStream.close();
    }
}