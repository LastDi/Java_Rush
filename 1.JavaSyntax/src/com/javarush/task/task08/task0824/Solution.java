package com.javarush.task.task08.task0824;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Собираем семейство
*/

public class Solution {
    public static void main(String[] args) {
        //два дедушки, две бабушки, отец, мать, трое детей.
        ArrayList<Human> children = new ArrayList<Human>();
        ArrayList<Human> childgrand1 = new ArrayList<Human>();
        ArrayList<Human> childgrand2 = new ArrayList<Human>();
        Human child1 = new Human("Joseph", true, 22);
        Human child2 = new Human("Loenid", true, 12);
        Human child3 = new Human("Anastasasasasasastsatstiia", false, 16);
        children.add(child1);
        children.add(child2);
        children.add(child3);
        Human papa = new Human("Ivan", true, 35, children);
        Human mama = new Human("Lola", false, 34, children);
        childgrand1.add(papa);
        childgrand2.add(mama);
        Human gPapa1 = new Human("Maxim", true, 55, childgrand1);
        Human gPapa2 = new Human("Efim", true, 60, childgrand2);
        Human gMama1 = new Human("Vera", false, 56, childgrand1);
        Human gMama2 = new Human("Lera", false, 62, childgrand2);

    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public Human (String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = new ArrayList<Human>();
            System.out.println(Human.this.toString());
        }
        public Human (String name, boolean sex, int age, ArrayList<Human> children){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
            System.out.println(Human.this.toString());
        }


        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
