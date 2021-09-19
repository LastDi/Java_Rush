package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }
        int min = list.get(0).length();
        int mini = 0;
        for (int i = 1; i < 10; i++) {
            if (list.get(i).length() < min) {
                min = list.get(i).length();
                mini = i;
            }
        }
        int max = list.get(0).length();
        int maxi = 0;
        for (int i = 1; i < 10; i++) {
            if (list.get(i).length() > max) {
                max = list.get(i).length();
                maxi = i;
            }
        }
        if (mini < maxi)
        System.out.println(list.get(mini));
        else if (maxi < mini)
        System.out.println(list.get(maxi));
    }
}
