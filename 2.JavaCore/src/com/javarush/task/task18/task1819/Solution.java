package com.javarush.task.task18.task1819;

import java.io.*;

/* 
Объединение файлов
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2s = reader.readLine();
        FileInputStream file1Input = new FileInputStream(file1);
        FileInputStream file2 = new FileInputStream(file2s);
        reader.close();
        byte[] buf = new byte[file1Input.available()];
        file1Input.read(buf);
        file1Input.close();
        byte[] buf2 = new byte[file2.available()];
        file2.read(buf2);
        file2.close();
        FileOutputStream file1Output = new FileOutputStream(file1);
        file1Output.write(buf2);
        file1Output.write(buf);
        file1Output.close();
    }
}
