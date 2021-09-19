package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        boolean a = true;
        ArrayList<Integer> num = new ArrayList<>();
        while (a) {
            try {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                num.add(Integer.parseInt(reader.readLine()));
            } catch (Exception e) {
                a = false;
                for (int i = 0; i <num.size(); i++) {
                    System.out.println(num.get(i));
                }

            }
        }
    }
}
