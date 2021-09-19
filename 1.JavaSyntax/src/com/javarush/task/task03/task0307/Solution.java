package com.javarush.task.task03.task0307;

/* 
Привет StarCraft!
*/

public class Solution {
    public static void main(String[] args) {
        Zerg zerg1 = new Zerg();
        zerg1.name = "vata1";
        Zerg zerg2 = new Zerg();
        zerg2.name = "vata2";
        Zerg zerg3 = new Zerg();
        zerg3.name = "vata3";
        Zerg zerg4 = new Zerg();
        zerg4.name = "vata4";
        Zerg zerg5 = new Zerg();
        zerg5.name = "vata5";
        Protoss protoss1 = new Protoss();
        protoss1.name = "sata1";
        Protoss protoss2 = new Protoss();
        protoss2.name = "sata2";
        Protoss protoss3 = new Protoss();
        protoss3.name = "sata3";
        Terran terran1 = new Terran();
        terran1.name = "tasa1";
        Terran terran2 = new Terran();
        terran2.name = "tasa2";
        Terran terran3 = new Terran();
        terran3.name = "tasa3";
        Terran terran4 = new Terran();
        terran4.name = "tasa4";//напишите тут ваш код

    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
