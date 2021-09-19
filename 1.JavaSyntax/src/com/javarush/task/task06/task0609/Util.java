package com.javarush.task.task06.task0609;

/* 
Расстояние между двумя точками
*/

public class Util {
    public static double getDistance(int x1, int y1, int x2, int y2) {
       double x = (x2 - x1)*(x2 - x1);
       double y = (y2 - y1)*(y2 - y1);
       double distance = Math.sqrt(x + y);
       return distance;
    }

    public static void main(String[] args) {
        System.out.println(getDistance(3, 3,5,5));
    }
}
