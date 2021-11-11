package com.javarush.task.task19.task1919;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/* 
Считаем зарплаты
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new FileReader(args[0]));
        TreeMap<String, Double> map = new TreeMap<>();
        while (read.ready()) {
            String[] arr = read.readLine().split(" ");
            if (map.containsKey(arr[0]))
                map.replace(arr[0], map.get(arr[0]) + Double.parseDouble(arr[1]));
            else
                map.put(arr[0], Double.parseDouble(arr[1]));
        }
        read.close();
        for (String key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }
    }
}
