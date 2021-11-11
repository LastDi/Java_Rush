package com.javarush.task.task16.task1603;

import java.util.ArrayList;
import java.util.List;

/* 
Список и нити
*/

public class Solution {
    public static volatile List<Thread> list = new ArrayList<Thread>(5);

    public static void main(String[] args) {
        SpecialThread spTh1 = new SpecialThread();
        SpecialThread spTh2 = new SpecialThread();
        SpecialThread spTh3 = new SpecialThread();
        SpecialThread spTh4 = new SpecialThread();
        SpecialThread spTh5 = new SpecialThread();

        Thread th1 = new Thread(spTh1);
        list.add(th1);
        Thread th2 = new Thread(spTh2);
        list.add(th2);
        Thread th3 = new Thread(spTh3);
        list.add(th3);
        Thread th4 = new Thread(spTh4);
        list.add(th4);
        Thread th5 = new Thread(spTh5);
        list.add(th5);

        for (Thread start : list) {
            start.start();
        }

    }

    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("it's a run method inside SpecialThread");
        }
    }
}
