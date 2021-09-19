package com.javarush.task.task04.task0404;

/* 
Учет котов
*/

public class Cat {
    private static int catsCount = 0;

    public static void addNewCat() {
        catsCount++;//напишите тут ваш код

    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        cat.addNewCat();
        System.out.println(catsCount);
        cat2.addNewCat();
        System.out.println(catsCount);
        cat3.addNewCat();
        System.out.println(catsCount);

    }
}
