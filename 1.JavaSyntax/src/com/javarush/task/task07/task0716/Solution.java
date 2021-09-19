package com.javarush.task.task07.task0716;

import javax.swing.*;
import java.sql.ClientInfoStatus;
import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        for (int i=strings.size()-1; i>=0; i--) {
            if (strings.get(i).contains("р")&&strings.get(i).contains("л")){
            }
            else if (strings.get(i).contains("р")){
                strings.remove(i);
            }
            else if (strings.get(i).contains("л")){
                strings.add(i, strings.get(i));
            }
        }
        return strings;
    }
}