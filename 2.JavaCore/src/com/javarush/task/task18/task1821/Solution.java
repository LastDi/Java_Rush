package com.javarush.task.task18.task1821;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* 
Встречаемость символов
*/

public class Solution {
    public static void main(String[] args) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        if (args.length > 0) {
            try (BufferedReader read = new BufferedReader(new FileReader(args[0]))) {
                while (read.ready()) {
                    int ch = read.read();
                    if (!map.containsKey(ch)) {
                        map.put(ch, 1);
                    }
                    else {
                        int count = map.get(ch) + 1;
                        map.replace(ch, count);
                    }
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
        for (Map.Entry<Integer, Integer> pair : map.entrySet()) {
            int i = pair.getKey();
            String c = Character.toString((char) i);
            System.out.println(c + " " + pair.getValue());
        }
    }
}
