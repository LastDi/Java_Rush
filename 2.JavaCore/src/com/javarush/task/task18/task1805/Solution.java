 package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> bytes = new ArrayList<>();
        List<Integer> newBytes = new ArrayList<>();
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String fileName = read.readLine();
        read.close();
        FileInputStream input = new FileInputStream(fileName);
        int counter = -1;
        while (input.available() > 0) { // запись считанных байтов в лист
            int data = input.read();
            bytes.add(data);
        }
        input.close();
        newBytes.add(bytes.get(0));
        for (int i = 1; i < bytes.size(); i++) { // запись уникальных байтов в новый лист
            for (int j = 0; j < newBytes.size(); j++) {
                if (bytes.get(i).equals(newBytes.get(j))) { //если есть совпадения, отрабатывает счетчик
                    counter++;
                }
            }
            if (counter < 0) { //если счетчик имеет первоначальное значение, значит байт уникальный
                newBytes.add(bytes.get(i));
            }
            counter = -1;
        }
        Collections.sort(newBytes); //сортировка листа уникальных байтов

        for (int i = 0; i < newBytes.size(); i++) { //вывод на печать
                System.out.print(newBytes.get(i));
                System.out.print(" ");
            }
        }
    }

