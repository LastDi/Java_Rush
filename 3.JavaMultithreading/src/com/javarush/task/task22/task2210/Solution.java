package com.javarush.task.task22.task2210;

import java.util.StringTokenizer;

/* 
StringTokenizer
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static String[] getTokens(String query, String delimiter) {
        StringTokenizer tokenz = new StringTokenizer(query, delimiter);
        int count = tokenz.countTokens();
        String[] res = new String[count];
        int i = 0;
        while (tokenz.hasMoreTokens())
        {
            res[i] = tokenz.nextToken();
            i++;
        }
        return res;
    }
}
