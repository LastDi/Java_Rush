package com.javarush.task.task20.task2021;

import java.io.*;

/* 
Сериализация под запретом
*/

public class Solution implements Serializable {
    public static class SubSolution extends Solution {


        private void writeObject(ObjectOutputStream out) throws IOException {
            throw new NotSerializableException();
        }

        private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
            throw new NotSerializableException();
        }

    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileOutputStream stream = new FileOutputStream("/home/lastinc/1.txt");
        ObjectOutputStream os = new ObjectOutputStream(stream);
        Solution.SubSolution sr = new SubSolution();
        os.writeObject(sr);

        FileInputStream istream = new FileInputStream("/home/lastinc/1.txt");
        ObjectInputStream is = new ObjectInputStream(istream);
        Solution.SubSolution load = (SubSolution) is.readObject();

        System.out.println(sr);
        System.out.println(load);

    }
}
