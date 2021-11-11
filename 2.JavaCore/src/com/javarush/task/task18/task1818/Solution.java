package com.javarush.task.task18.task1818;

import java.io.*;

/* 
Два в одном
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileOutputStream file1 = new FileOutputStream(reader.readLine());
        FileInputStream file2 = new FileInputStream(reader.readLine());
        FileInputStream file3 = new FileInputStream(reader.readLine());
        while (file2.available() > 0) {
            file1.write(file2.read());
        }
        file2.close();
        while (file3.available() > 0) {
            file1.write(file3.read());
        }
        file3.close();
        file1.close();
    }
}
