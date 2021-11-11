package com.javarush.task.task14.task1416;

/* 
Стой, кто плывет?
*/

public class Solution {
    public static void main(String[] args) {
        CanSwim creature = new Orca();
        creature.swim();
        creature = new Whale();
        creature.swim();
        creature = new RiverOtter();
        creature.swim();
    }

    public static void test(CanSwim creature) {
        creature.swim();
    }

    interface CanWalk {
        void walk();
    }

    interface CanSwim {
        void swim();
    }

    static abstract class SeaCreature {
        public void swim() {
            SeaCreature currentCreature = (SeaCreature) getCurrentCreature();
            currentCreature.displaySwim();
        }

        private void displaySwim() {
            System.out.println(getCurrentCreature().getClass().getSimpleName() + " is swimming");
        }

        abstract CanSwim getCurrentCreature();
    }

    static class Orca extends SeaCreature implements CanSwim{
        private static Orca orca;
        public void swim() {
            SeaCreature currentCreature = (Orca) getCurrentCreature();
            currentCreature.displaySwim();
        }

        private void displaySwim() {
            System.out.println(getCurrentCreature().getClass().getSimpleName() + " is swimming");
        }

        CanSwim getCurrentCreature() {
            if (orca == null) {
                orca = new Orca();
            }
            return orca;
        }
    }

    static class Whale extends SeaCreature implements CanSwim{
        private static Whale whale;
        public void swim() {
            SeaCreature currentCreature = (Whale) getCurrentCreature();
            currentCreature.displaySwim();
        }

        private void displaySwim() {
            System.out.println(getCurrentCreature().getClass().getSimpleName() + " is swimming");
        }

        CanSwim getCurrentCreature() {
            if (whale == null) {
                whale = new Whale();
            }
            return whale;
        }
    }

    static class RiverOtter implements CanWalk, CanSwim{
        private static final RiverOtter riverOtter = new RiverOtter();
        public void swim() {
            System.out.println(riverOtter.getClass().getSimpleName() + " is swimming");
        }
        public void walk() {
            System.out.println(riverOtter.getClass().getSimpleName() + " is walk");
        }
    }
}
