package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private String name;
        private String lastname;
        private int age;
        private int weight;
        private boolean sex;
        private char rest;

        public Human(String name){
            this.name = name;
        }
        public Human(String name, String lastname){
            this.name = lastname;
            this.name = name;
        }
        public Human(String name, String lastname, int age){
            this.name = lastname;
            this.name = name;
            this.age = age;
        }
        public Human(String name, String lastname, int age, int weight){
            this.name = lastname;
            this.name = name;
            this.age = age;
            this.weight = weight;
        }
        public Human(String name, String lastname, int age, int weight, boolean sex){
            this.name = lastname;
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.sex = sex;
        }
        public Human(String name, String lastname, int age, int weight, boolean sex, char rest){
            this.name = lastname;
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.sex = sex;
            this.rest = rest;
        }
        public Human(String name, int age, int weight, boolean sex, char rest){
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.sex = sex;
            this.rest = rest;
        }
        public Human(String name, String lastname, int weight, boolean sex, char rest){
            this.name = lastname;
            this.name = name;
            this.weight = weight;
            this.sex = sex;
            this.rest = rest;
        }
        public Human(int age, int weight, boolean sex, char rest){
            this.age = age;
            this.weight = weight;
            this.sex = sex;
            this.rest = rest;
        }
        public Human(String name, String lastname, boolean sex, char rest){
            this.name = lastname;
            this.name = name;
            this.sex = sex;
            this.rest = rest;
        }
    }
}
