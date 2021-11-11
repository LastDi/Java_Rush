package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        if (args[0].equals("-c")) {
            //System.out.println(allPeople.size());
            SimpleDateFormat date_s = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
            Date date = null;
            try {
                date = date_s.parse(args[3]);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            if (args[2].equals("м")) {
                allPeople.add(Person.createMale(args[1], date));
            }
            else if (args[2].equals("ж")) {
                allPeople.add(Person.createFemale(args[1], date));
            }
            System.out.println(allPeople.size() - 1);
            //System.out.println(allPeople.get(allPeople.size() - 1).getName());
        }
        else if (args[0].equals("-r")) {
            Person person = allPeople.get(Integer.parseInt(args[1]));
            String s = person.getSex().equals(Sex.MALE) ? "м" : "ж";
            SimpleDateFormat df = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
            System.out.println(person.getName() + " " + s + " " + df.format(person.getBirthDate()));
        }
        else if (args[0].equals("-u")) {
            int i = Integer.parseInt(args[1]);
            allPeople.get(i).setName(args[2]);
            SimpleDateFormat date_s = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
            Date date = null;
            try {
                date = date_s.parse(args[4]);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            System.out.println(date);
            allPeople.get(i).setBirthDate(date);
            if (args[3].equals("м")) {
                allPeople.get(i).setSex(Sex.MALE);
            }
            else if (args[3].equals("ж")) {
                allPeople.get(i).setSex(Sex.FEMALE);
            }

        }
        else if (args[0].equals("-d")) {
            int i = Integer.parseInt(args[1]);
            allPeople.get(i).setSex(null);
            allPeople.get(i).setName(null);
            allPeople.get(i).setBirthDate(null);
        }
    }
}
