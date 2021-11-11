package com.javarush.task.task13.task1326;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/* 
Сортировка четных чисел из файла
*/

public class Solution {
    public static void main(String[] args) throws IOException{
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String file = reader.readLine();
            reader.close();
            ArrayList<Integer> numbs = new ArrayList<Integer>();
                BufferedReader bufRead = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
                while (bufRead.ready()) {
                    numbs.add(Integer.parseInt(bufRead.readLine()));
                }
                for (int i = 0; i < numbs.size(); i++) {
                    for (int j = i + 1; j < numbs.size(); j++) {
                        if (numbs.get(i) > numbs.get(j)) {
                            int tmp = numbs.get(i);
                            numbs.set(i, numbs.get(j));
                            numbs.set(j, tmp);
                        }
                    }
                }
                for (Integer x : numbs) {
                    if (x % 2 == 0) {
                        System.out.println(x);
                    }
                }
                bufRead.close();
    }
}
