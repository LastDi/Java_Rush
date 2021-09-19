package com.javarush.task.task08.task0819;

import java.io.BufferedReader;
import java.util.HashSet;
import java.util.Set;

/* 
Set из котов
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        cats.remove(cats.toArray()[1]);
        printCats(cats);
    }

    public static Set<Cat> createCats() {
        Set<Cat> catSet = new HashSet<>();
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        catSet.add(cat1);
        catSet.add(cat2);
        catSet.add(cat3);
        return catSet;
    }

    public static void printCats(Set<Cat> cats) {
        for (Cat s : cats) {
            System.out.println(s);
        }
    }

    public static class Cat{

    }
}
