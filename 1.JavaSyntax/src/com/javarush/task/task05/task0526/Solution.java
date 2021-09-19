package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        Man man = new Man("Vasya", 10, "Out");
        Man man1 = new Man("Pasha", 98, "Ost");
        Woman woman = new Woman("Masha", 12, "In");
        Woman woman1 = new Woman("Opa", 86);
        System.out.println(man.name + " " + man.age + " " + man.address);
        System.out.println(woman.name + " " + woman.age + " " + woman1.address);
    }

    public static class Man{
      String name;
      int age;
      String address;

      public Man(String name){
          this.name = name;
          this.age = 10;
      }
      public Man(String name, int age){
          this.name = name;
          this.age = age;
      }
      public Man(String name, int age, String address){
          this.name = name;
          this.age = age;
          this.address = address;
      }
    }
    public static class Woman{
        String name;
        int age;
        String address;

        public Woman(String name){
            this.name = name;
            this.age = 12;
        }
        public Woman(String name, int age){
            this.name = name;
            this.age = age;
        }
        public Woman(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }

    }
}
