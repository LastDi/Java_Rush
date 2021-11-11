package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) {

    }

    static {
        Solution.reset();
    }

    public static CanFly result;

    public static void reset() {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String txt = reader.readLine();
            if (txt.equals("helicopter")) {
                result = new Helicopter();
            }
            else if (txt.equals("plane")) {
                result = new Plane(Integer.parseInt(reader.readLine()));
            }
            reader.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class Plane implements CanFly{
    int countPas;

    public Plane (int countPas) {
        this.countPas = countPas;
    }
    @Override
    public void fly() {
        System.out.println("Plane fly");
    }
}

class Helicopter implements CanFly{

    @Override
    public void fly() {
        System.out.println("Helic fly");
    }
}
