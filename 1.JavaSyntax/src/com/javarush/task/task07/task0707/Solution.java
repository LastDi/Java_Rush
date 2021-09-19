package com.javarush.task.task07.task0707;


import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i, "super");
        }
        int size = list.size();
        System.out.println(size);
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }
    }
}
