package com.javarush.task.task15.task1502;

/* 
ООП - Наследование животных
*/

public class Solution {
    //добавьте классы Goose и Dragon тут

    public static void main(String[] args) {

    }

    public static class BigAnimal {
        protected String getSize() {
            return "как динозавр";
        }
    }

    public static class SmallAnimal {
        String getSize() {
            return "как кошка";
        }
    }

    public static class Goose extends SmallAnimal {
        @Override
        public String getSize() {
            String info;
            info = "Гусь маленький, " + super.getSize();
            return info;
        }
    }
    public static class Dragon extends BigAnimal {
        @Override
        public String getSize() {
            String info;
            info = "Дракон большой, " + super.getSize();
            return info;
        }
    }
}
