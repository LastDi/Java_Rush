package com.javarush.task.task18.task1810;

import java.io.*;

/* 
DownloadException
*/

public class Solution {
    public static void main(String[] args) throws IOException, DownloadException{
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            while (true) {
                FileInputStream input = new FileInputStream(reader.readLine());
                if (input.available() < 1000) {
                    input.close();
                    reader.close();
                    throw new DownloadException();
                }
                input.close();
            }

    }

    public static class DownloadException extends Exception {

    }
}
