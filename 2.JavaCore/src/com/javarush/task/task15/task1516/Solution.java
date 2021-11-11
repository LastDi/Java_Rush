package com.javarush.task.task15.task1516;

/* 
Значения по умолчанию
*/

import javax.swing.*;

public class Solution {
    public int intVar = 0;
    public double doubleVar = 0;
    public Double DoubleVar = (Double) null;
    public boolean booleanVar = false;
    public Object ObjectVar = (Object) null;
    public Exception ExceptionVar = (Exception) null;
    public String StringVar = null;

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.intVar);
        System.out.println(solution.doubleVar);
        System.out.println(solution.DoubleVar);
        System.out.println(solution.booleanVar);
        System.out.println(solution.ObjectVar);
        System.out.println(solution.ExceptionVar);
        System.out.println(solution.StringVar);
    }
}
