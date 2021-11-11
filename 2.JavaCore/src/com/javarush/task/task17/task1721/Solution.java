package com.javarush.task.task17.task1721;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws CorruptedDataException {
        Solution sol = new Solution();
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String file1 = reader.readLine();
            String file2 = reader.readLine();
            reader.close();
            BufferedReader read1 = new BufferedReader(new FileReader(file1));
            String tmp = read1.readLine();
            while (tmp != null) {
                allLines.add(tmp);
                tmp = read1.readLine();
            }
            read1.close();
            BufferedReader read2 = new BufferedReader(new FileReader(file2));
            tmp = read2.readLine();
            while (tmp != null) {
                forRemoveLines.add(tmp);
                tmp = read2.readLine();
            }
            read2.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        sol.joinData();
    }

    public void joinData() throws CorruptedDataException {
            for (int i = 0; i < forRemoveLines.size(); i++) {
                int ind = allLines.indexOf(forRemoveLines.get(i));
                if (ind == -1) {
                    while (allLines.size() > 0)
                        allLines.remove(0);
                    throw new CorruptedDataException();
                }
                allLines.remove(ind);
            }
    }
}
