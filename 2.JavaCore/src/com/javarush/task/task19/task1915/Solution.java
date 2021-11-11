package com.javarush.task.task19.task1915;

import java.io.*;

/* 
Дублируем текст
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        PrintStream cons = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream str = new PrintStream(out);
        System.setOut(str);
        testString.printSomething();
        String text = out.toString();
        BufferedWriter write = new BufferedWriter(new FileWriter(fileName));
        write.write(text);
        write.close();
        System.setOut(cons);
        FileOutputStream outputStream = new FileOutputStream(fileName);
        System.out.println(text);
        outputStream.close();
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}

