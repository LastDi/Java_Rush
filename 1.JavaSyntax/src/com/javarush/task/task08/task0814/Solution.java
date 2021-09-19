package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static Set<Integer> createSet() {
        Set<Integer> numList = new HashSet<Integer>();
        for (int i = 0; i < 20; i++) {
            numList.add(i * 2);
        }
        return numList;
    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
        Iterator<Integer> iterator = set.iterator();

        while (iterator.hasNext()){
            Integer x = iterator.next();
            if (x > 10){
                iterator.remove();
            }
        }
        return set;
    }

    public static void main(String[] args) {

    }
}
