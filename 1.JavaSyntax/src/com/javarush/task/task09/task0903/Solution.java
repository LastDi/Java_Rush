package com.javarush.task.task09.task0903;

/* 
Кто меня вызывал?
*/

public class Solution {
    public static void main(String[] args) {
        method1();
    }

    public static int method1() {
        method2();
        return Thread.currentThread().getStackTrace()[2].getLineNumber();
    }

    public static int method2() {
        method3();
        return Thread.currentThread().getStackTrace()[2].getLineNumber();
    }

    public static int method3() {
        method4();
        return Thread.currentThread().getStackTrace()[2].getLineNumber();
    }

    public static int method4() {
        method5();
        return Thread.currentThread().getStackTrace()[2].getLineNumber();
    }

    public static int method5() {
        /* System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName()); // Это method5
        System.out.println(Thread.currentThread().getStackTrace()[2].getMethodName()); // Его вызвал предыдущий метод - method4
        System.out.println(Thread.currentThread().getStackTrace()[3].getMethodName()); // Его вызвал предыдущий метод - method3
        System.out.println(Thread.currentThread().getStackTrace()[4].getMethodName()); // Его вызвал предыдущий метод - method2
        System.out.println(Thread.currentThread().getStackTrace()[5].getMethodName()); // Его вызвал предыдущий метод - method1
        System.out.println(Thread.currentThread().getStackTrace()[2].getLineNumber()); // номер строки где вызывается метод5
        System.out.println(Thread.currentThread().getStackTrace()[3].getLineNumber()); // номер строки где вызывается метод4
        System.out.println(Thread.currentThread().getStackTrace()[4].getLineNumber()); // номер строки где вызывается метод3
        System.out.println(Thread.currentThread().getStackTrace()[5].getLineNumber()); // номер строки где вызывается метод2
        System.out.println(Thread.currentThread().getStackTrace()[6].getLineNumber()); // номер строки где вызывается метод1 */
        return Thread.currentThread().getStackTrace()[2].getLineNumber();
    }
}
