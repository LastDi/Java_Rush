package com.javarush.task.task21.task2107;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/* 
Глубокое клонирование карты
*/

public class Solution implements Cloneable{

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.users.put("Hubert", new User(172, "Hubert"));
        solution.users.put("Zapp", new User(41, "Zapp"));
        Solution clone = null;
        try {
            clone = (Solution) solution.clone();
            System.out.println(solution);
            System.out.println(clone);

            System.out.println(solution.users);
            System.out.println(clone.users);

        } catch (Exception e) {
            e.printStackTrace(System.err);
        }
    }

    @Override
    public int hashCode() {
        return users != null ? users.hashCode() : 0;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null)
            return false;
        if (this == o)
            return true;
        if (!(o instanceof Solution))
            return false;
        Solution solution = (Solution) o;
        return Objects.equals(users, solution.users);
    }

    public Object clone() {
        Solution solution = new Solution();
        Map<String, User> users = new LinkedHashMap();
        for (Map.Entry<String, User> pair : this.users.entrySet()) {
            User user = (User) pair.getValue().clone();
            String name = pair.getKey();
            users.put(name, user);
        }
        solution.users = users;
        return solution;
    }

    protected Map<String, User> users = new LinkedHashMap();

    public static class User implements Cloneable{
        int age;
        String name;

        public User(int age, String name) {
            this.age = age;
            this.name = name;
        }

        public Object clone() {
            User user = new User(this.age, this.name);
            user.name = this.name;
            user.age = this.age;
            return user;
        }

        @Override
        public int hashCode() {
            return Objects.hash(age, name);
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == null)
                return false;
            if (this == obj)
                return true;
            if (!(obj instanceof User))
                return false;
            User user = (User) obj;
            return (user.age == age && Objects.equals(user.name, name));
        }
    }
}
