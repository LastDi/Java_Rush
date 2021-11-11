package com.javarush.task.task20.task2003;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* 
Знакомство с properties
*/

public class Solution {

    public static Map<String, String> runtimeStorage = new HashMap<>();

    public static void save(OutputStream outputStream) throws Exception {
        Properties properties = new Properties();
        for (Map.Entry<String, String> pair : runtimeStorage.entrySet()) {
            properties.setProperty(pair.getKey(), pair.getValue());
        }
        properties.store(outputStream, null);
        outputStream.close();
    }

    public static void load(InputStream inputStream) throws IOException {
        Properties properties = new Properties();
        properties.load(inputStream);
        for (Map.Entry pair : properties.entrySet()) {
            runtimeStorage.put(pair.getKey().toString(), pair.getValue().toString());
        }
        inputStream.close();
    }

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String txt = reader.readLine();
        FileInputStream fos = new FileInputStream(txt);
        FileOutputStream wos = new FileOutputStream("/home/lastinc/2.txt");
        load(fos);
        save(wos);

        System.out.println(runtimeStorage);
    }
}
