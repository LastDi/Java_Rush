package com.javarush.task.task20.task2014;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/* 
Serializable Solution
*/

public class Solution implements Serializable{
    public static void main(String[] args) {
        try {
            File myFile = File.createTempFile("my_file", null);
            OutputStream out = new FileOutputStream("/home/lastinc/1.txt");
            ObjectOutput outObj = new ObjectOutputStream(out);
            InputStream in = new FileInputStream("/home/lastinc/1.txt");
            ObjectInput inObj = new ObjectInputStream(in);
            Solution savedObject = new Solution(3);
            outObj.writeObject(savedObject);
            Solution loadedObject = (Solution) inObj.readObject();
            System.out.println(new Solution(4));
            System.out.println(savedObject.string);
            System.out.println(loadedObject.string);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    transient private final String pattern = "dd MMMM yyyy, EEEE";
    transient private Date currentDate;
    transient private int temperature;
    String string;

    public Solution(int temperature) {
        this.currentDate = new Date();
        this.temperature = temperature;

        string = "Today is %s, and the current temperature is %s C";
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        this.string = String.format(string, format.format(currentDate), temperature);
    }

    @Override
    public String toString() {
        return this.string;
    }
}
