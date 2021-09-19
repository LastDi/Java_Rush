package com.javarush.task.task04.task0411;

/* 
Время года
*/

public class Solution {
    public static void main(String[] args) {
        checkSeason(12);
        checkSeason(4);
        checkSeason(7);
        checkSeason(13);
    }

    public static void checkSeason(int month) {
        if (month < 3 || month == 12){
            System.out.println("зима");//напишите тут ваш код
        }
        else if (month < 6 & month > 2){
            System.out.println("весна");
        }
        else if (month < 9 & month > 5){
            System.out.println("лето");
        }
        else if (month < 12 & month > 8){
            System.out.println("осень");
        }
        else {
            System.out.println("Такого месяца не существует!");
        }

    }
}