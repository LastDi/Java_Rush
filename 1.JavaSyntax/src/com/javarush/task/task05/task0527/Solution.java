package com.javarush.task.task05.task0527;

/* 
Том и Джерри
*/

public class Solution {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);
        Cat tomCat = new Cat("Tom", 12, 20);
        Dog bulDog = new Dog("Buldog", 22, "Grey");

        //напишите тут ваш код
    }

    public static class Mouse {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    public static class Dog {
        String name;
        int weight;
        String color;

        public Dog(String name, int weight, String color) {
            this.name = name;
            this.weight = weight;
            this.color = color;
        }
    }

    public static class Cat {
        String name;
        int age;
        int height;

        public Cat (String name, int age, int height){
            this.name = name;
            this.age = age;
            this.height = height;
        }
    }
}
