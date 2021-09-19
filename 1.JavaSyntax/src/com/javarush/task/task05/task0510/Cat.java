package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    String name;
    String address;
    String color;
    int age;
    int weight;

    public void initialize(String name){
        this.name = name;
        this.age = 5;
        this.weight = 5;
        this.color = "Black";
    }
    public void initialize(String name, int age){
        this.name = name;
        this.age = age;
        this.weight = 5;
        this.color = "Black";
    }
    public void initialize(String name, int weight, int age){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = "Black";
    }
    public void initialize(int weight ,String color){
        this.color = color;
        this.weight = weight;
        this.age = 10;
    }
    public void initialize(int weight, String color, String address){
        this.color = color;
        this.address = address;
        this.weight = weight;
        this.age = 5;
        }

    public static void main(String[] args) {

    }

}
