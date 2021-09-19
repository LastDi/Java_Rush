package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text  = reader.readLine();
        char[] strToArray = text.toCharArray();
        ArrayList<Character> vowels1 = new ArrayList<>();
        ArrayList<Character> consonants = new ArrayList<>();
        for (int i = 0; i < strToArray.length; i++) {
            if (isVowel(strToArray[i])){
                vowels1.add(strToArray[i]);}
            else if (strToArray[i] != ' ')
                consonants.add(strToArray[i]);
        }
        for (Character vowel1 : vowels1) {
            System.out.print(vowel1 + " ");
        }
        System.out.println();
        for (Character consonant : consonants){
            System.out.print(consonant + " ");
        }
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char character) {
        character = Character.toLowerCase(character);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char vowel : vowels) {  // ищем среди массива гласных
            if (character == vowel) {
                return true;
            }
        }
        return false;
    }
}