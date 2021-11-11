package com.javarush.task.task18.task1807;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Подсчет запятых
*/

public class Solution {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            FileInputStream input = new FileInputStream(reader.readLine());
            reader.close();
            byte[] buf = new byte[input.available()];
            input.read(buf);
            int count = 0;
            for (int i = 0; i < buf.length; i++) {
                if (buf[i] == 44) {
                    count++;
                }
            }
            System.out.println(count);
            input.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
}
