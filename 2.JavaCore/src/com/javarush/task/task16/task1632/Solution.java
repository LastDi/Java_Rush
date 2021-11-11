package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Клубок
*/

public class Solution{
    public static List<Thread> threads = new ArrayList<>(5);
    static {
        threads.add(new First());
        threads.add(new Second());
        threads.add(new Third());
        threads.add(new Fourth());
        threads.add(new Fifth());
    }

    static class First extends Thread{
        @Override
        public void run() {
            while (!isInterrupted()) {}
        }
    }
    static class Second extends Thread{
        @Override
        public void run() {
            try {
                if (currentThread().isInterrupted())
                    Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
        }
    }
    static class Third extends Thread{
        @Override
        public void run() {
            try {
                while (!isInterrupted()) {
                    System.out.println("Ура");
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    static class Fourth extends Thread implements Message {
        @Override
        public void run() {
            while (!isInterrupted()) {}
        }

        @Override
        public void showWarning() {
            interrupt();
        }
    }
    static class Fifth extends Thread {
        @Override
        public void run() {
            try {
                BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
                int res = 0;
                String txt = read.readLine();
                while (!txt.equals("N")) {
                    res += Integer.parseInt(txt);
                    txt = read.readLine();
                }
                System.out.println(res);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            threads.get(i).start();
        }
    }
}