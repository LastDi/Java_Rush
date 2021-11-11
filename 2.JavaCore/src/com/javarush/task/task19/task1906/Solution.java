package com.javarush.task.task19.task1906;

import java.io.*;
import java.util.ArrayList;

/* 
Четные символы
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        FileReader read = new FileReader(reader.readLine());
        FileWriter write = new FileWriter(reader.readLine());
        reader.close();

        while (read.ready()) {
            count++;
            if (count % 2 == 0) {
                write.write(read.read());
            }
            else {
                read.read();
            }
        }
        read.close();
        write.close();
    }
}
