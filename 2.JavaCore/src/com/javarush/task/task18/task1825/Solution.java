package com.javarush.task.task18.task1825;

import java.io.*;
import java.util.*;

/* 
Собираем файл
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        TreeSet<String> files = new TreeSet<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        String tmp = "";
        if (!fileName.equals("end"))
            tmp = fileName.substring(0, fileName.lastIndexOf("."));
        while (!fileName.equals("end")) {
            files.add(fileName);
            fileName = reader.readLine();
        }
        reader.close();
        if (files.size() == 0)
            return;
        System.out.println(tmp);
        File file= new File (tmp);
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        for (String s : files) {
            BufferedReader read = new BufferedReader(new FileReader(s));
            while (read.ready()) {
                writer.write(read.read());
            }
            read.close();
        }
        writer.close();
    }
}
