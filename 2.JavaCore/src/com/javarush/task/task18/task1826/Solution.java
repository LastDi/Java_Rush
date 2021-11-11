package com.javarush.task.task18.task1826;

import java.io.*;

/* 
Шифровка
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        if (args[0].equals("-e")) {
            FileInputStream input = new FileInputStream(args[1]);
            FileOutputStream output = new FileOutputStream(args[2]);
            while (input.available() > 0) {
                int data = input.read() + 1;
                output.write(data);
            }
            input.close();
            output.close();
        }
        else if (args[0].equals("-d")) {
            FileInputStream input = new FileInputStream(args[1]);
            FileOutputStream output = new FileOutputStream(args[2]);
            while (input.available() > 0) {
                int data = input.read() - 1;
                output.write(data);
            }
            input.close();
            output.close();
        }
    }

}
