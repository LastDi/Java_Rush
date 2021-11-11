package com.javarush.task.task15.task1531;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

/* 
Факториал
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(reader.readLine());
        reader.close();

        System.out.println(factorial(input));
    }

    public static String factorial(int n) {
        String result;
        BigInteger res = new BigInteger("1");

        if (n == 0)
            result = "1";
        else if (n <= 150 && n > 0){
            for (int i = 1; i <= n; i++) {
                res = res.multiply(BigInteger.valueOf(Long.parseLong(String.valueOf(i))));
            }
            result = res.toString();
        }
        else
            result = "0";

        return result;
    }
}
