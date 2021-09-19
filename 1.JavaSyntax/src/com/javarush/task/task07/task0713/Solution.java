package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.ArrayList;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> list3 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        ArrayList<Integer> list1 = new ArrayList<Integer>();

        for (int i = 0; i<20; i++){
            int x = Integer.parseInt(read.readLine());
            list.add(x);
        }

        for (int i = 0; i<list.size(); i++) {
            if (list.get(i) % 3 == 0) {
                list3.add(list.get(i));
            }
        }

        for (int i = 0; i<list.size(); i++) {
                if (list.get(i) % 2 == 0) {
                    list2.add(list.get(i));
                }
            }
        for (int i = 0; i<list.size(); i++) {
                    if (list.get(i) % 3 != 0 && list.get(i)%2!= 0) {
                        list1.add(list.get(i));
                    }
                }
        printList(list3);
        printList(list2);
        printList(list1);
        }

    public static void printList(ArrayList<Integer> list) {
        for (int i = 0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
