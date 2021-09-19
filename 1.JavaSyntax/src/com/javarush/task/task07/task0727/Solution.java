package com.javarush.task.task07.task0727;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Меняем функциональность
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> stringSize = new ArrayList<>();
        ArrayList<String> strings = new ArrayList<String>();
        while (true) {
            String string = reader.readLine();
            if (string == null || string.isEmpty()) break;
            strings.add(string);
            char[] sumSymbols = string.toCharArray();
            stringSize.add(sumSymbols.length);
        }

        ArrayList<String> resultStrings = new ArrayList<String>();
        for (int i = 0; i < strings.size(); i++) {
            if (stringSize.get(i) % 2 == 0) {
                System.out.println(strings.get(i) + " " + strings.get(i));
            }
            if (stringSize.get(i) % 2 != 0){
                System.out.println(strings.get(i) + " " + strings.get(i) + " " + strings.get(i));
            }
        }

    }
}
