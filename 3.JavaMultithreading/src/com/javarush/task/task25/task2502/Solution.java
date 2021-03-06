package com.javarush.task.task25.task2502;

import java.util.*;

/* 
Машину на СТО не повезем!
*/

public class Solution {
    public static enum Wheel {
        FRONT_LEFT,
        FRONT_RIGHT,
        BACK_LEFT,
        BACK_RIGHT
    }

    public static class Car {
        protected List<Wheel> wheels;

        public Car() {
            String[] wheelString = loadWheelNamesFromDB();
            wheels = new ArrayList<>();
            if (wheelString.length != Wheel.values().length)
                throw new UnsupportedOperationException();
            for (String s : wheelString) {
                wheels.add(Wheel.valueOf(s));
            }
        }

        protected String[] loadWheelNamesFromDB() {
            //this method returns mock data
            return new String[]{"FRONT_LEFT", "FRONT_RIGHT", "BACK_LEFT", "BACK_RIGHT"};
        }
    }

    public static void main(String[] args) {
        Car car = new Car();
    }
}
