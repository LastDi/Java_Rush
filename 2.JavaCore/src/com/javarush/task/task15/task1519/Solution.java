package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String txt = reader.readLine();
        while (!txt.equals("exit")) {
            try {
                if (txt.contains("."))
                    print(Double.parseDouble(txt));
                else if (Integer.parseInt(txt) < 128 && Integer.parseInt(txt) > 0)
                    print(Short.parseShort(txt));
                else
                    print(Integer.parseInt(txt));
            }
            catch (NumberFormatException e) {
                print(txt);
            }
            txt = reader.readLine();
        }
        reader.close();
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
