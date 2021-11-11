package com.javarush.task.task19.task1914;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/* 
Решаем пример
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream cons = System.out;
        ByteArrayOutputStream outp = new ByteArrayOutputStream();
        PrintStream str = new PrintStream(outp);
        System.setOut(str);
        testString.printSomething();
        String text = outp.toString();
        String newText = text.replaceAll("\n", "");
        String numberOnly= text.replaceAll("[^0-9]", " ");
        String[] arr = numberOnly.split(" ");
        int[] num = new int[2];
        int i = 0;
        System.setOut(cons);
        for (String x : arr) {
            if (x.matches("\\d+")) {
                num[i] = Integer.parseInt(x);
                i = 1;
            }
        }
        Integer res = 0;
        if (text.contains("+"))
            res = num[0] + num[1];
        if (text.contains("-"))
            res = num[0] - num[1];
        if (text.contains("*"))
            res = num[0] * num[1];
        StringBuilder sb = new StringBuilder(newText);
        sb.insert(newText.length(), res);
        System.out.println(sb);

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

