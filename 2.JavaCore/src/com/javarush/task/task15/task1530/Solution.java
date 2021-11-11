package com.javarush.task.task15.task1530;

/* 
Template pattern
*/

public class Solution {
    public static void main(String[] args) {
    }
}

abstract class DrinkMaker {
    abstract void getRightCup();
    abstract void putIngredient();
    abstract void pour();

    public void makeDrink() {
        getRightCup();
        putIngredient();
        pour();
    }
}

class LatteMaker extends DrinkMaker {
    @Override
    void getRightCup() {
        System.out.println("Берем чашку для латте");
    }
    @Override
    void putIngredient() {
        System.out.println("Делаем молоко с пенкой");
    }
    @Override
    void pour() {
        System.out.println("Заливаем кофе");
    }
}

class TeaMaker extends DrinkMaker {
    @Override
    void getRightCup() {
        System.out.println("Берем чашку для чая");
    }
    @Override
    void putIngredient() {
        System.out.println("Насыпаем чай");
    }
    @Override
    void pour() {
        System.out.println("Заливаем кипятком");
    }
}