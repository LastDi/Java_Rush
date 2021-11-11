package com.javarush.task.task18.task1824;

import java.io.*;
import java.nio.file.LinkPermission;
import java.util.ArrayList;
import java.util.List;

/* 
Файлы и исключения
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean check = true;
        List<FileInputStream> input = new ArrayList<>();
        while (check) {
            String filename = reader.readLine();
            try {
                input.add(new FileInputStream(filename));
            } catch (FileNotFoundException e) {
                System.out.println(filename);
                for (int j = 0; j < input.size(); j++) {
                    input.get(j).close();
                }
                check = false;
            }
        }
        reader.close();
    }
}
