package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException, ParseException {

        if (args.length == 0)
            return;
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        String txt = reader.readLine();
        while (txt != null) {
            String[] app = txt.split("\\d");
            String date_s = txt.substring(app[0].length());
            SimpleDateFormat format = new SimpleDateFormat("dd MM yyyy");
            Date date = format.parse(date_s);
            Person person = new Person(app[0].trim(), date);
            PEOPLE.add(person);
            txt = reader.readLine();
        }
        reader.close();
    }
}
