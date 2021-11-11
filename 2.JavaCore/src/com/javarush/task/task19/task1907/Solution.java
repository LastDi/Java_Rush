package com.javarush.task.task19.task1907;

import java.io.*;

/* 
Считаем слово
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileReader read = new FileReader(reader.readLine());
        reader.close();

        boolean flag = false;
        int count = 0;
        int check = 0;

        char[] world = {'w', 'o', 'r', 'l', 'd'};

        while (read.ready()) {
            char c = (char) read.read();
            if (c == 32 && check != 0) {
                c = (char) read.read();
                if (c == world[0]) {
                    for (int i = 1; i < world.length; i++) {
                        c = (char) read.read();
                        if (c != world[i]) {
                            flag = false;
                            break;
                        }
                        flag = true;
                    }
                    if (flag) {
                        count++;
                    }
                }
            }
            else if (check == 0) {
                if (c == world[0]) {
                    for (int i = 1; i < world.length; i++) {
                        c = (char) read.read();
                        if (c != world[i]) {
                            flag = false;
                            break;
                        }
                        flag = true;
                    }
                    if (flag) {
                        count++;
                    }
                }
            }
            check++;
        }
        read.close();
        System.out.println(count);
    }
}
