/* package com.javarush.task.task19.task1919;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class BackUp {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new FileReader("/home/lastinc/1.txt"));
        List<String> name = new ArrayList<>();
        List<Double> val = new ArrayList<>();
        List<String> text = new ArrayList<>();
        List<String> resName = new ArrayList<>();
        while (read.ready()) {
            text.add(read.readLine());
        }
        read.close();
        for (String s : text) {
            String tmp = s.replaceAll("[^0-9, .]", "");
            name.add(s.replaceAll("[0-9, .]", ""));
            val.add(Double.parseDouble(tmp));
        }
        Map<String, Double> map = new HashMap<>();
        map.put(name.get(0), val.get(0));
        resName.add(name.get(0));
        int flag = -1;
        for (int i = 1; i < name.size(); i++) {
            for (int j = 0; j < resName.size(); j++) {
                if (name.get(i).contains(resName.get(j))) {
                    flag++;
                    map.replace(name.get(j), val.get(j),  val.get(i) + val.get(j));
                    break;
                }
            }
            if (flag < 0) {
                map.put(name.get(i), val.get(i));
                resName.add(name.get(i));
            }
        }
        Collections.sort(resName);
        for (int i = 0; i < resName.size(); i++) {
            for (Map.Entry<String, Double> pair : map.entrySet()) {
                String key = pair.getKey();
                Double value = pair.getValue();
                if (resName.get(i).equals(key))
                    System.out.println(resName.get(i) + " " + value);
            }
        }
    }
}
*/