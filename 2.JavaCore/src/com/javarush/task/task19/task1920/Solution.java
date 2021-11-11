package com.javarush.task.task19.task1920;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* 
Самый богатый
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        TreeMap<String, Double> map = new TreeMap<>();
        double max = 0.0d;
        while (reader.ready()) {
            String[] arr = reader.readLine().split(" ");
            if (map.containsKey(arr[0]))
                map.replace(arr[0], map.get(arr[0]) + Double.parseDouble(arr[1]));
            else
                map.put(arr[0], Double.parseDouble(arr[1]));
        }
        reader.close();
        for (Map.Entry<String, Double> pair : map.entrySet()) {
            if (pair.getValue() > max)
                max = pair.getValue();
        }
        for (Map.Entry<String, Double> pair : map.entrySet()) {
            if (max == pair.getValue()) {
                System.out.println(pair.getKey());
            }
        }
    }
}
