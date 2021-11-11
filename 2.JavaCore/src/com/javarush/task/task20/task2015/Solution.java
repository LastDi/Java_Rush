package com.javarush.task.task20.task2015;

import java.io.*;

/* 
Переопределение сериализации
*/

public class Solution implements Runnable, Serializable{
    transient private Thread runner;
    private int speed;

    public Solution(int speed) {
        this.speed = speed;
        runner = new Thread(this);
        runner.start();
        System.out.println("Create elem");
    }

    public void run() {
        System.out.println("Nothing else matters");
    }

    /**
     * Переопределяем сериализацию.
     * Для этого необходимо объявить методы:
     * private void writeObject(ObjectOutputStream out) throws IOException
     * private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException
     * Теперь сериализация/десериализация пойдет по нашему сценарию :)
     */
    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        System.out.println(this);
        in.defaultReadObject();
        System.out.println(this);
        runner = new Thread(this);
        runner.start();
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Solution solution = new Solution(3);
        Solution sol = new Solution(4);
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("/home/lastinc/1.txt"));
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("/home/lastinc/1.txt"));
        out.writeObject(solution);
        sol = (Solution) in.readObject();
        System.out.println(sol.speed);
    }
}
