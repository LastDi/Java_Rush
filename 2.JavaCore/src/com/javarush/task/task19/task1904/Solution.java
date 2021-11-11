package com.javarush.task.task19.task1904;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        PersonScanner personScanner = new PersonScannerAdapter(new Scanner("Петров Петр Петрович 31 12 1957"));
        Person person = personScanner.read();
        System.out.println(person);
    }

    public static class PersonScannerAdapter implements PersonScanner{
        private Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read(){
            Person person = null;

            DateFormat df = new SimpleDateFormat("dd MM yyyy");
            try {
                String txt = this.fileScanner.nextLine();
                String[] info = txt.split(" ");
                String dateStr = info[3] + " " + info[4] + " " + info[5];
                Date date = df.parse(dateStr);
                person = new Person(info[1], info[2], info[0], date);
            }
            catch (Exception e) {
                e.printStackTrace();
            }
            return person;
        }

        @Override
        public void close() throws IOException {
            this.fileScanner.close();
        }
    }
}
