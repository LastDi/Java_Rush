package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Самые редкие байты
*/

public class Solution {



    public static void main(String[] args) throws Exception {
        List<Integer> bytes = new ArrayList<>();
        List<Integer> newBytes = new ArrayList<>();
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String fileName = read.readLine();
        read.close();
        FileInputStream input = new FileInputStream(fileName);
        int counter = -1;
        while (input.available() > 0) {
            int data = input.read();
            bytes.add(data);
        }
        input.close();
        newBytes.add(bytes.get(0));
        for (int i = 1; i < bytes.size(); i++) {
            for (int j = 0; j < newBytes.size(); j++) {
                if (bytes.get(i).equals(newBytes.get(j))) {
                    counter++;
                }
            }
            if (counter < 0) {
                newBytes.add(bytes.get(i));
            }
            counter = -1;
        }
        counter = 0;
        List<Integer> count = new ArrayList<>();
        for (int i = 0; i < newBytes.size(); i++) {
            for (int j = 0; j < bytes.size(); j++) {
                if (newBytes.get(i).equals(bytes.get(j))) {
                    counter++;
                }
            }
            count.add(counter);
            counter = 0;
        }
        int min = count.get(0);
        for (int i = 1; i < count.size(); i++) {
            if (min > count.get(i)) {
                min = count.get(i);
            }
        }
        for (int i = 0; i < count.size(); i++) {
            if (count.get(i) == min) {
                System.out.print(newBytes.get(i));
                System.out.print(" ");
            }
        }
    }
}
