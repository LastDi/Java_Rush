 package com.javarush.task.task19.task1923;

import java.io.*;

/* 
Слова с цифрами
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]));
        int flag = 0;
        while (reader.ready()) {
            String txt = reader.readLine();
            String[] arr = txt.split(" ");
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].matches(".*\\d+.*") && !arr[i].matches("\\d+")) {
                    writer.write(arr[i]);
                    writer.write(32);
                    flag++;
                }
                if (i == arr.length - 1)
                    flag = 0;
            }
            if (flag > 0)
                writer.write("\n");
            flag = 0;
        }
        reader.close();
        writer.close();
    }
}
