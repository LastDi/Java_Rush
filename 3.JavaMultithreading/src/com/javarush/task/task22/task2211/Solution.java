package com.javarush.task.task22.task2211;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* 
Смена кодировки
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream is = new FileInputStream(args[0]);
        FileOutputStream os = new FileOutputStream(args[1]);
        Charset utf8 = Charset.forName("UTF-8");
        Charset win1251 = Charset.forName("Windows-1251");
        byte[] inp = new byte[10000];
        is.read(inp);
        is.close();
        String inputStr = new String(inp, win1251);
        inp = inputStr.getBytes(utf8);
        os.write(inp);
        os.close();
    }
}
