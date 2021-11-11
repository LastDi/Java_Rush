package com.javarush.task.task22.task2207;

import java.io.*;
import java.util.*;

/* 
Обращенные слова
*/

public class Solution {
    public static List<Pair> result = new LinkedList<>();

    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();
        reader.close();
        Map<String, Integer> list = new HashMap<>();
        BufferedReader read = new BufferedReader((new FileReader(file)));
        StringBuilder txt = new StringBuilder();
        while (read.ready()) {
            txt.append(read.readLine() + " ");
        }
        String[] res = txt.toString().split(" ");
        for (int i = 0; i < res.length - 1; i++) {
            StringBuilder str;
            int countI = 0;
            int countJ = 0;
            int count = 0;
            for (int j = i + 1; j < res.length; j++) {
                str = new StringBuilder(res[j]);
                str.reverse();
                if (str.toString().equals(res[i])) {
                    for (int k = 0; k < j ; k++) {
                        if (str.toString().equals(res[j]))
                            count++;
                        else if (res[j].equals(res[k]))
                            countJ++;
                    }
                    //if (!result.contains(pair))
                    for (int k = 0; k < i; k++) {
                        if (res[i].equals(res[k]))
                            countI++;
                    }
                    System.out.println(countI + " I " + countJ);
                    if (countI == countJ || count % 2 == 0) {
                        Pair pair = new Pair();
                        pair.first = res[i];
                        pair.second = res[j];
                        result.add(pair);
                        break;
                    }
                }
            }
        }
        read.close();
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }

    public static class Pair {
        String first;
        String second;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Pair pair = (Pair) o;

            if (first != null ? !first.equals(pair.first) : pair.first != null) return false;
            return second != null ? second.equals(pair.second) : pair.second == null;

        }

        @Override
        public int hashCode() {
            int result = first != null ? first.hashCode() : 0;
            result = 31 * result + (second != null ? second.hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {
            return first == null && second == null ? "" :
                    first == null ? second :
                            second == null ? first :
                                    first.compareTo(second) < 0 ? first + " " + second : second + " " + first;

        }
    }

}
