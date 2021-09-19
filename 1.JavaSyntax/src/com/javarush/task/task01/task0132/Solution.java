package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        int n1 = number/100;
        int n2 = number/10 - (number/100)*10;
        int n3 =  number - (number/10)*10;//напишите тут ваш код
        int sum = n1 + n2 + n3;
        /*System.out.println(sum);

        int m1 = number % 1000 / 100;
        int m2 = (number % 100)/10;
        int m3 = number % 10;
        System.out.println(m1+m2+m3);*/
        return sum;
    }
}