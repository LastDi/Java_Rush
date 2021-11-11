package com.javarush.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* 
User, Loser, Coder and Proger
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;
        List<String> keys = Arrays.asList("user", "loser", "coder", "proger");
        key = reader.readLine();
        while (keys.contains(key)) {
            if (Person.Coder.class.getSimpleName().toLowerCase(Locale.ROOT).equals(key))
                person = new Person.Coder();
            else if (Person.Loser.class.getSimpleName().toLowerCase(Locale.ROOT).equals(key))
                person = new Person.Loser();
            else if (Person.Proger.class.getSimpleName().toLowerCase(Locale.ROOT).equals(key))
                person = new Person.Proger();
            else if (Person.User.class.getSimpleName().toLowerCase(Locale.ROOT).equals(key))
                person = new Person.User();
            doWork(person);
            key = reader.readLine();
        }
        reader.close();
    }

    public static void doWork(Person person) {
        if (person instanceof Person.User)
            ((Person.User) person).live();
        else if (person instanceof Person.Loser)
            ((Person.Loser) person).doNothing();
        else if (person instanceof Person.Coder)
            ((Person.Coder) person).writeCode();
        else if (person instanceof Person.Proger)
            ((Person.Proger) person).enjoy();
    }
}
