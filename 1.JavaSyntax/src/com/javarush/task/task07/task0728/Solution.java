package com.javarush.task.task07.task0728;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
В убывающем порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        for (int x : array) {
            System.out.println(x);
        }
    }

    public static void sort(int[] array) {
        int rare;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[j] < array[i]) {
                    rare = array[i];
                    array [i] = array [j];
                    array [j] = rare;
                }
            }
               /* 1 2 3 4 5

                2 1 3 4 5
                3 1 2 4 5
                3 2 1 4 5
                4 2 1 3 5
                4 3 1 2 5
                4 3 2 1 5
                5 3 2 1 4
                5 4 2 1 3
                5 4 3 1 2
                5 4 3 2 1
                Пример сортировки массива из 5 чисел
                */

        }
    }
}
