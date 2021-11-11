package com.javarush.task.task18.task1809;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Реверс файла
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputFile = new FileInputStream(read.readLine());
        FileOutputStream outputFile = new FileOutputStream(read.readLine());
        byte[] buf = new byte[inputFile.available()];
        inputFile.read(buf);
        int maxIndex = buf.length - 1;
        for (int i = 0; i < buf.length; i++) {
            outputFile.write(buf[maxIndex - i]);
        }
        outputFile.close();
        inputFile.close();
    }
}
