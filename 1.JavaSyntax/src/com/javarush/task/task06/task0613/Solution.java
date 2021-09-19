package com.javarush.task.task06.task0613;

/* 
Кот и статика
*/

public class Solution {
    public static void main(String[] args) {
        Cat cat1 = new Cat();// Создай 10 котов
        Cat cat2 = new Cat();// Создай 10 котов
        Cat cat3 = new Cat();// Создай 10 котов
        Cat cat4 = new Cat();// Создай 10 котов
        Cat cat5 = new Cat();// Создай 10 котов
        Cat cat6 = new Cat();// Создай 10 котов
        Cat cat7 = new Cat();// Создай 10 котов
        Cat cat8 = new Cat();// Создай 10 котов
        Cat cat9 = new Cat();// Создай 10 котов
        Cat cat10 = new Cat();// Создай 10 котов
        System.out.println(Cat.catCount);
        // Выведи значение переменной catCount
    }

    public static class Cat {
        public static int catCount = 0;// Создай статическую переменную catCount

        public Cat(){
            catCount++;
        }// Создай конструктор
    }
}
