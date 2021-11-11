package com.javarush.task.task13.task1319;

import java.io.*;
import java.nio.charset.StandardCharsets;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String txt = reader.readLine(); //считывание пути и названия файла
        BufferedWriter bufWriter = new BufferedWriter(new FileWriter(txt)); //открытие потока для записи в файл с использованием буфера
        String buf = reader.readLine(); //считывание данных с консоли
        while (!buf.equals("exit")) //пока не exit записываем в файл
        {
            bufWriter.write((buf + "\n"));
            buf = reader.readLine();
        }
        bufWriter.write((buf + "\n"));
        bufWriter.close();
        reader.close();
    }
}
