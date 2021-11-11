package com.javarush.task.task18.task1813;

import java.io.*;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;

/* 
AmigoOutputStream
*/

public class AmigoOutputStream extends FileOutputStream{
    public static String fileName = "C:/tmp/result.txt";
    private FileOutputStream output;

    public static void main(String[] args) throws FileNotFoundException {
        new AmigoOutputStream(new FileOutputStream(fileName));
    }

    private AmigoOutputStream(FileOutputStream output) throws FileNotFoundException {
        super(fileName);
        this.output = output;
    }

    @Override
    public void write(int b) throws IOException {
        output.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException {
        output.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        output.write(b, off, len);
    }

    @Override
    public void close() throws IOException {
        output.flush();
        String txt = "JavaRush © All rights reserved.";
        output.write(txt.getBytes(StandardCharsets.UTF_8));
        output.close();
    }

    @Override
    public void flush() throws IOException {
        output.flush();
    }

    @Override
    public FileChannel getChannel() {
        return output.getChannel();
    }
}
