package com.javarush.task.task12.task1226;

/* 
Лазать, летать и бегать
*/

import java.sql.SQLOutput;

public class Solution {
    public interface CanFly {
        void fly();
    }
    public interface CanClimb {
        void climb();
    }
    public interface CanRun{
        void run();
    }

    public static void main(String[] args) {

    }

    public class Cat implements CanClimb, CanRun{
        @Override
        public void climb() {
            System.out.println("Я лазаю");
        }

        @Override
        public void run() {
            System.out.println("Я бегаю");
        }
    }

    public class Dog implements CanRun{
        @Override
        public void run() {
            System.out.println("Я бегаю");
        }
    }

    public class Tiger extends Cat {
        @Override
        public void run() {
            System.out.println("Я бегаю как тигр");;
        }
    }

    public class Duck implements CanFly, CanRun{
        @Override
        public void fly() {
            System.out.println("Я летаю");
        }

        @Override
        public void run() {
            System.out.println("Я бегаю");
        }
    }
}
