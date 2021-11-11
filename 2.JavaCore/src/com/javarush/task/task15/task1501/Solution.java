package com.javarush.task.task15.task1501;

/* 
ООП - Расставить интерфейсы
*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface Movable {
        boolean isMovable();
    }

    public interface Sellable {
        Object getAllowedAction(String name);
    }

    public interface Discountable {
        Object getAllowedAction();
    }

    public static class Clothes implements Movable, Sellable, Discountable {
        private String name;
        public Clothes(String name) {
            this.name = name;
        }
        public Clothes() {
        }

        @Override
        public boolean isMovable() {
            return true;
        }

        @Override
        public Object getAllowedAction(String name) {
            Object o = new Clothes(name);
            return o;
        }

        @Override
        public Object getAllowedAction() {
            Object o = new Clothes();
            return o;
        }
    }
}
