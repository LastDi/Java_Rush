package com.javarush.task.task15.task1522;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Закрепляем паттерн Singleton
*/

public class Solution {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(thePlanet);
    }

    public static Planet thePlanet;

    {
        readKeyFromConsoleAndInitPlanet();;
    }

    public static void readKeyFromConsoleAndInitPlanet() {
        String planetName = null;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            planetName = reader.readLine();
            if (planetName.equals(Planet.EARTH))
                thePlanet = Earth.getInstance();
            else if (planetName.equals(Planet.MOON))
                thePlanet = Moon.getInstance();
            else if (planetName.equals(Planet.SUN))
                thePlanet = Sun.getInstance();
            else
                thePlanet = null;
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
