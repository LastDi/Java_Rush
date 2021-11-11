package com.javarush.task.task19.task1925;

import java.io.*;
import java.util.ArrayList;

/* 
Длинные слова
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]));
        ArrayList<String> list = new ArrayList<>();
        while (reader.ready()) {
            String tmp = reader.readLine();
            String[] arr = tmp.split(" ");
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].length() > 6) {
                    list.add(arr[i]);
                }
            }
        }
        for (int i = 0; i < list.size(); i++) {
            writer.write(list.get(i));
            if (i != list.size() - 1)
                writer.write(",");
            System.out.println(list.get(i));
        }
        reader.close();
        writer.close();
    }
}
