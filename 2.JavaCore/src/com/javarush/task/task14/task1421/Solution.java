package com.javarush.task.task14.task1421;

/* 
Singleton
*/

public class Solution {
    public static void main(String[] args) {
    }
}

class Singleton {
    private static Singleton instance;

    private Singleton() {
    }
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
