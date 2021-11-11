package com.javarush.task.task20.task2022;

import java.io.*;

/* 
Переопределение сериализации в потоке
*/

public class Solution implements Serializable, AutoCloseable {
    private transient FileOutputStream stream;
    private String fileName;

    public Solution(String fileName) throws FileNotFoundException {
        this.fileName = fileName;
        this.stream = new FileOutputStream(fileName);
    }

    public void writeObject(String string) throws IOException {
        stream.write(string.getBytes());
        stream.write("\n".getBytes());
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        stream = new FileOutputStream(fileName, true);
        in.defaultReadObject();
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closing everything!");
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ByteArrayOutputStream arrOut = new ByteArrayOutputStream();
        ObjectOutputStream os = new ObjectOutputStream(arrOut);
        Solution sol = new Solution("file");
        os.writeObject(sol);

        ByteArrayInputStream arrIn = new ByteArrayInputStream(arrOut.toByteArray());
        ObjectInputStream is = new ObjectInputStream(arrIn);

        Solution new_sol = (Solution) is.readObject();


    }
}
