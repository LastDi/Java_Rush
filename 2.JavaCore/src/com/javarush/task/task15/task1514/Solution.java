package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    static {
        labels.put(1d, "one");
        labels.put(2d, "two");
        labels.put(3d, "three");
        labels.put(4d, "four");
        labels.put(5d, "five");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
