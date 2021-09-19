package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        int[] num1 = new int[] {1, 2, 3, 4, 5};
        int[] num2 = new int[] {7, 8};
        int[] num3 = new int[] {4, 3, 3, 4};
        int[] num4 = new int[] {2, 2, 3, 2, 2, 3, 5};
        int[] num5 = new int[]{};
        ArrayList<int[]> list = new ArrayList<>();
        list.add(num1);
        list.add(num2);
        list.add(num3);
        list.add(num4);
        list.add(num5);
        return list;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
