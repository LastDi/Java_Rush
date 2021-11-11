package com.javarush.task.task14.task1409;

/* 
Мосты
*/

public class Solution {
    public static void main(String[] args) {
        println(new WaterBridge());
        println(new SuspensionBridge());
    }

    public static void println(Bridge bridge) {
        System.out.println(bridge.getCarsCount());
    }
}
interface Bridge {
    int getCarsCount();
}

class WaterBridge implements Bridge{
    @Override
    public int getCarsCount() {
        return 12;
    }
}

class SuspensionBridge implements Bridge{
    @Override
    public int getCarsCount() {
        return 24;
    }
}