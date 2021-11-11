package com.javarush.task.task18.task1822;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Поиск данных внутри файла
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        if (args.length == 0) {
            return;
        }
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName))) {
            while (fileReader.ready()) {
                String str = fileReader.readLine();
                String[] tmp = str.split(" ");
                if (Integer.parseInt(tmp[0]) == Integer.parseInt(args[0])) {
                    System.out.println(str);
                    break;
                }
            }
        }
    }
}
