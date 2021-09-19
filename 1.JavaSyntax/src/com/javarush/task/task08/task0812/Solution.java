package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Cамая длинная последовательность
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> nums = new ArrayList<Integer>();
        int count = 1;
        int tmpcount = 1;
        for (int i = 0; i < 10; i++) {
            nums.add(Integer.parseInt(reader.readLine()));
        }
        for (int i = 0; i < nums.size()-1; i++) {
                if (nums.get(i).equals(nums.get(i+1))) {
                    tmpcount++;
                    if (tmpcount > count)
                        count = tmpcount;
                }
                else tmpcount = 1;
            }
        System.out.println(count);
        }
    }
