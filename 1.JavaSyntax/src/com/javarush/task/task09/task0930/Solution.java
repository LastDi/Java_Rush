package com.javarush.task.task09.task0930;

import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Задача по алгоритмам Ӏ Java Syntax: 9 уровень, 11 лекция
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        String line = reader.readLine();
        while (!line.isEmpty()) {
            list.add(line);
            line = reader.readLine();
        }

        String[] array = list.toArray(new String[0]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        ArrayList<Integer> orderOfNumbers = new ArrayList<>(); // лист для порядковых номеров чисел
        ArrayList<Integer> numbers = new ArrayList<>(); // лист для сортировки чисел
        ArrayList<String> words = new ArrayList<>(); // лист для сортировки слов
        for (int i = 0; i < array.length; i++) {
            if (isNumber(array[i])) { //проверка является ли элемент массива числом
                orderOfNumbers.add(i); //запись порядкового номера числа в лист
                numbers.add(Integer.parseInt(array[i])); //запись числа в лист чисел для сортировки
            }
            else
                words.add(array[i]); //запись слов в лист для сортировки строк
        }
        for (int j = 0; j < words.size(); j++) { //сортировка строк в листе по возрастанию
            for (int i = j+1; i < words.size(); i++) {
                if (isGreaterThan(words.get(j), words.get(i))) {
                    String tmp = words.get(j);
                    words.set(j, words.get(i));
                    words.set(i, tmp);
                }
            }
        }
        for (int j = 0; j < numbers.size(); j++) { //сортировка чисел в листе по убыванию
            for (int i = j+1; i < numbers.size(); i++) {
                if (numbers.get(j) < numbers.get(i)) {
                    Integer tmp = numbers.get(j);
                    numbers.set(j, numbers.get(i));
                    numbers.set(i, tmp);
                }
            }
        }
        int count = 0;
        int countA = 0;
        for (int i = 0; i < array.length; i++) {
            if (orderOfNumbers.size() > 0) { //на случай отутствия чисел в изначальном массиве
                if (orderOfNumbers.get(count) == i) { //проверка совпадения порядкового номера из листа Ордер с порядковым номером итерации в цикле
                    array[i] = numbers.get(count).toString(); //запись отсортированного числа в тот же слот массива
                    if (count < orderOfNumbers.size() - 1) { //добавление счетчика для движения по листу порядковых номеров
                        count++;
                    }
                }
                else {
                    array[i] = words.get(countA); //запись отсортированных строк в тот же слот массива если есть числа
                    countA++;
                }
            }
            else {
                  array[i] = words.get(countA); //запись отсортированных строк в тот же слот массива если нет чисел
                  countA++;
            }
        }
    }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String text) {
        if (text.length() == 0) {
            return false;
        }

        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char character = chars[i];

            // есть '-' внутри строки
            if (i != 0 && character == '-') {
                return false;
            }

            // не цифра и не начинается с '-'
            if (!Character.isDigit(character) && character != '-') {
                return false;
            }

            // одиночный '-'
            if (chars.length == 1 && character == '-') {
                return false;
            }
        }

        return true;
    }
}
