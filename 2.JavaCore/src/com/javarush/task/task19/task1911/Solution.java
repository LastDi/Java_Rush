package com.javarush.task.task19.task1911;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Locale;

/* 
Ридер обертка
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream cons = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream str = new PrintStream(out);
        System.setOut(str);
        testString.printSomething();
        String text = out.toString();
        System.setOut(cons);
        String res = text.toUpperCase(Locale.ROOT);
        System.out.println(res);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}
