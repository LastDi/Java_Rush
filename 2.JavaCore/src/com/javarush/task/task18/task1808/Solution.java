package com.javarush.task.task18.task1808;

import java.io.*;

/* 
Разделение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputFile1 = new FileInputStream(reader.readLine()); // поток для считывания с файла1
        FileOutputStream outputFile2 = new FileOutputStream(reader.readLine()); // поток записи в файл 2
        FileOutputStream outputFile3 = new FileOutputStream(reader.readLine()); // поток записи в файл 3
        reader.close();
        byte[] buf = new byte[inputFile1.available()]; //создания буфферного массива размером с файл
        int count = inputFile1.read(buf); //считывание количества байт в файле
        if (count % 2 == 0) { //деление в 2 файла если четное кол-во
            outputFile2.write(buf, 0, count / 2);
            outputFile3.write(buf, count / 2, count / 2);
        }
        else { // деление инфы в 2 файла если нечетное кол-во байт
            outputFile2.write(buf, 0, count / 2 + 1);
            outputFile3.write(buf, count / 2 + 1, count / 2);
        }
        inputFile1.close();
        outputFile2.close();
        outputFile3.close();
    }
}
