package com.javarush.task.task14.task1419;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        try {
            float i = 1 / 0;
        }  catch (Exception e) {
            exceptions.add(e);
        }
        try {
            throw new IOException("Two");
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            throw new RuntimeException("Three");
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            throw new ArrayStoreException("Four");
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            throw new ArrayIndexOutOfBoundsException("Five");
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            throw new ClassCastException("Six");
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            throw new NoSuchFieldException("Seven");
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            throw new NumberFormatException("Eight");
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            throw new FileNotFoundException("Nine");
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            throw new NullPointerException("Ten");
        } catch (Exception e) {
            exceptions.add(e);
        }

    }
}
