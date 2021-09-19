package com.javarush.task.task13.task1304;

/* 
Selectable и Updatable
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Screen screen = new Screen();
        screen.onSelect();
    }

    interface Selectable {
        void onSelect();
    }

    interface Updatable {
        void refresh();
    }
     public static class Screen implements Selectable, Updatable {
         @Override
         public void onSelect() {
             System.out.println("Element is selected");
         }

         @Override
         public void refresh() {
             System.out.println("System is refreshed");
         }
     }
}
