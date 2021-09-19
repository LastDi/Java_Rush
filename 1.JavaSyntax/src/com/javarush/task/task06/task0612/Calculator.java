package com.javarush.task.task06.task0612;

/* 
Калькулятор
*/

public class Calculator {
    public static int plus(int a, int b) {
        //напишите тут ваш код
        return (a + b);
    }

    public static int minus(int a, int b) {
        //напишите тут ваш код
        return (a - b);
    }

    public static int multiply(int a, int b) {
        //напишите тут ваш код
        return (a * b);
    }

    public static double division(int a, int b) {
        double c = (double) a / b;//напишите тут ваш код
        return c;
    }

    public static double percent(int a, int b) {
        double c = (double) a * b / 100;
        return c;
    }

    public static void main(String[] args) {
        System.out.println(percent(4, 53));
    }
}