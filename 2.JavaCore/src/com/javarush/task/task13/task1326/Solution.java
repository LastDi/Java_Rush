package com.javarush.task.task13.task1326;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/* 
Сортировка четных чисел из файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> nums = new ArrayList<>();
        String text;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String txt = reader.readLine();
        FileInputStream inputStream = new FileInputStream(txt);
        BufferedInputStream buffer = new BufferedInputStream(inputStream);
        while (buffer.available() > 0) {
            char c = (char) buffer.read();
            int x = Character.getNumericValue(c);
            if (x != -1) {
                text = (String) c;
            }
            nums.add(x);
            System.out.println(c);
        }
        for (Integer x : nums) {
            System.out.print(x);
        }

        reader.close();
        buffer.close();
        inputStream.close();
    }
}
