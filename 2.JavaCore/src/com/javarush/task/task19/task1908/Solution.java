package com.javarush.task.task19.task1908;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Выделяем числа
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String firstFile = bufferedReader.readLine();
        String secondFile = bufferedReader.readLine();
        bufferedReader.close();
        BufferedReader reader = new BufferedReader(new FileReader(firstFile));
        BufferedWriter writer = new BufferedWriter(new FileWriter(secondFile));
        List<Integer> list = new ArrayList<>();
        String data = reader.readLine(); // считали строку из файла 1
        String[] strings = data.split(" "); // разделили по пробелам строку на массив строк
        for (String str : strings){
            if (str.matches("\\d+")) //если строка из массива строк является числом, то записали в файл 2
                writer.write(str + " ");
        }
        reader.close();
        writer.close();
    }
}
