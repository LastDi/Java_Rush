package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Самые частые байты
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
        while (input.available() > 0) { //считываем байты с файла и записываем в лист
            int data = input.read();
            bytes.add(data);
        }
        input.close();
        newBytes.add(bytes.get(0));
        for (int i = 1; i < bytes.size(); i++) { //записываем уникальные байты в новый лист
            for (int j = 0; j < newBytes.size(); j++) {
                if (bytes.get(i).equals(newBytes.get(j))) {
                    counter++;
                }
            }
            if (counter < 0) {
                newBytes.add(bytes.get(i));
            }
            counter = -1;
        }
        counter = 0;
        List<Integer> count = new ArrayList<>();
        for (int i = 0; i < newBytes.size(); i++) { //считаем сколько раз уникальный байт встречается в файле
            for (int j = 0; j < bytes.size(); j++) {
                if (newBytes.get(i).equals(bytes.get(j))) {
                    counter++;
                }
            }
            count.add(counter);
            counter = 0;
        }
        int max = count.get(0);
        for (int i = 1; i < count.size(); i++) { //находим байт(ы), который встречается чаще всего
            if (max < count.get(i)) {
                max = count.get(i);
            }
        }
        for (int i = 0; i < count.size(); i++) { //распечатываем самые часто встречаемые байты
            if (count.get(i) == max) {
                System.out.print(newBytes.get(i));
                System.out.print(" ");
            }
        }
    }
}
