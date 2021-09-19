package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    String name;
    int age;
    int weight;
    String address;
    String color;

    public Cat(String name){
        this.name = name;
        this.age = 10;
        this.weight = 10;
        this.color = "Black";
    }
    public  Cat(String name, int weight, int age){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = "Black";
    }
    public Cat(String name, int age){
        this.name = name;
        this.age = age;
        this.weight = 10;
        this.color = "Black";
    }
    public Cat(int weight, String color){
        this.weight = weight;
        this.color = color;
        this.age = 10;
    }
    public Cat(int weight, String color, String address){
        this.weight = weight;
        this.color = color;
        this.address = address;
        this.age = 10;
    }

    public static void main(String[] args) {

    }
}
