package com.javarush.task.task17.task1711;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        int len = args.length;
        int i = 1;
        switch (args[0]) {
            case ("-c"):
                synchronized (allPeople) {
                    while (i < len) {
                        //System.out.println(allPeople.size());
                        SimpleDateFormat date_s = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
                        Date date = null;
                        try {
                            date = date_s.parse(args[i + 2]);
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                        if (args[i + 1].equals("м")) {
                            allPeople.add(Person.createMale(args[i], date));
                        } else if (args[2].equals("ж")) {
                            allPeople.add(Person.createFemale(args[i], date));
                        }
                        System.out.println(allPeople.size() - 1);
                        i = i + 3;
                        //System.out.println(allPeople.get(allPeople.size() - 1).getName());
                    }
                }
                break;
            case ("-i"):
                synchronized (allPeople) {
                    while (i < len) {
                        Person person = allPeople.get(Integer.parseInt(args[i]));
                        String s = person.getSex().equals(Sex.MALE) ? "м" : "ж";
                        SimpleDateFormat df = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
                        System.out.println(person.getName() + " " + s + " " + df.format(person.getBirthDate()));
                        i++;
                    }
                }
                break;
            case ("-d"):
                synchronized (allPeople) {
                    while (i < len) {
                        int j = Integer.parseInt(args[i]);
                        allPeople.get(j).setSex(null);
                        allPeople.get(j).setName(null);
                        allPeople.get(j).setBirthDate(null);
                        i++;
                    }
                }
                break;
            case ("-u"):
                synchronized (allPeople) {
                    while (i < len) {
                        int j = Integer.parseInt(args[i]);
                        allPeople.get(j).setName(args[i + 1]);
                        SimpleDateFormat date_s = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
                        Date date = null;
                        try {
                            date = date_s.parse(args[i + 3]);
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                        System.out.println(date);
                        allPeople.get(j).setBirthDate(date);
                        if (args[i + 2].equals("м")) {
                            allPeople.get(j).setSex(Sex.MALE);
                        } else if (args[i + 2].equals("ж")) {
                            allPeople.get(j).setSex(Sex.FEMALE);
                        }
                        i = i + 4;
                    }
                }
                break;
        }

        /*
        if (args[0].equals("-c")) {
            int len = args.length;
            int i = 1;
            while (i < len) {
                //System.out.println(allPeople.size());
                SimpleDateFormat date_s = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
                Date date = null;
                try {
                    date = date_s.parse(args[i + 2]);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                if (args[i + 1].equals("м")) {
                    allPeople.add(Person.createMale(args[i], date));
                } else if (args[2].equals("ж")) {
                    allPeople.add(Person.createFemale(args[i], date));
                }
                System.out.println(allPeople.size() - 1);
                i = i + 3;
                //System.out.println(allPeople.get(allPeople.size() - 1).getName());
            }
        }
        else if (args[0].equals("-i")) {
            int len = args.length;
            int i = 1;
            while (i < len) {
                Person person = allPeople.get(Integer.parseInt(args[i]));
                String s = person.getSex().equals(Sex.MALE) ? "м" : "ж";
                SimpleDateFormat df = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
                System.out.println(person.getName() + " " + s + " " + df.format(person.getBirthDate()));
                i++;
            }
        }
        else if (args[0].equals("-u")) {
            int j = 1;
            int len = args.length;
            while (j < len) {
                int i = Integer.parseInt(args[j]);
                allPeople.get(i).setName(args[j + 1]);
                SimpleDateFormat date_s = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
                Date date = null;
                try {
                    date = date_s.parse(args[j + 3]);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                System.out.println(date);
                allPeople.get(i).setBirthDate(date);
                if (args[j + 2].equals("м")) {
                    allPeople.get(i).setSex(Sex.MALE);
                } else if (args[j + 2].equals("ж")) {
                    allPeople.get(i).setSex(Sex.FEMALE);
                }
                j = j + 4;
            }

        }
        else if (args[0].equals("-d")) {
            int len = args.length;
            int j = 1;
            while (j < len) {
                int i = Integer.parseInt(args[j]);
                allPeople.get(i).setSex(null);
                allPeople.get(i).setName(null);
                allPeople.get(i).setBirthDate(null);
                j++;
            }
        }

         */

    }
}
