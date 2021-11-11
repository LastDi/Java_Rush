package com.javarush.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws IOException{
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader read = new BufferedReader(new FileReader(consoleReader.readLine()));
        consoleReader.close();
        int count = 0;
        while (read.ready()) {
            String txt = read.readLine();
            String[] arr = txt.split(" ");
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < words.size(); j++) {
                    if (arr[i].equals(words.get(j))) {
                        count++;
                    }
                }
            }
            if (count == 2)
                System.out.println(txt);
            count = 0;
        }
        read.close();
    }
}
