package com.javarush.task.task15.task1523;

/* 
Перегрузка конструкторов
*/

public class Solution {
    private int age;
    private String name;

    Solution() {
    }
    private Solution(String name){
    }
    public Solution(int age){
    }
    protected Solution(String name, int age){
    }

    public static void main(String[] args) {
    }
}

class SubSolution extends Solution{
    public SubSolution() {
    }
    SubSolution(int age) {
        super(age);
    }
    protected SubSolution(String name, int age) {
        super(name, age);
    }
}

