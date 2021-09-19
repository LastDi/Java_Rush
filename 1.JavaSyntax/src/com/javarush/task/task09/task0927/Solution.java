package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        Map<String, Cat> map = new HashMap<String, Cat>();
        map.put("Kot1", new Cat("Valera"));
        map.put("Kot2", new Cat("James"));
        map.put("Kot3", new Cat("Ivan"));
        map.put("Kot4", new Cat("Roland"));
        map.put("Kot5", new Cat("Petr"));
        map.put("Kot6", new Cat("Donald"));
        map.put("Kot7", new Cat("Serafim"));
        map.put("Kot8", new Cat("John"));
        map.put("Kot9", new Cat("Oleg"));
        map.put("Kot10", new Cat("George"));
        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        Set<Cat> cats = new HashSet<>();
        for (Map.Entry<String, Cat> pair : map.entrySet()){
            Cat value = pair.getValue();
            cats.add(value);
        }
        return cats;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
