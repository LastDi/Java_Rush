package com.javarush.task.task20.task2026;

/* 
Алгоритмы-прямоугольники
*/

public class Solution {
    public static void main(String[] args) {
        byte[][] a1 = new byte[][]{
                {1, 1, 0, 0},
                {1, 1, 0, 0},
                {1, 1, 0, 0},
                {1, 1, 0, 1}
        };
        byte[][] a2 = new byte[][]{
                {1, 0, 0, 1},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {1, 0, 0, 1}
        };

        int count1 = getRectangleCount(a1);
        System.out.println("count = " + count1 + ". Должно быть 2");
        int count2 = getRectangleCount(a2);
        System.out.println("count = " + count2 + ". Должно быть 4");
    }

    public static int getRectangleCount(byte[][] a) {
        int count = 0;
        for (int i = 0; i < a.length; i++) { //пробегаемся по двумерному массиву
            for (int j = 0; j < a[i].length; j++) { //если снизу или справа есть ячейка = 1
                if (a[i][j] == 1) { //назначаем текущей ячейке значение 0
                       if (i < a.length - 1 && j < a[i].length - 1) { //в итоге из большого прямоугольника
                           if (a[i + 1][j] == 1 || a[i][j + 1] == 1) { //получае 1 ячейку со значением 1
                               a[i][j] = 0;
                           }
                       }
                       else if (i == a.length - 1 && j < a[i].length - 1) {
                           if (a[i][j + 1] == 1) {
                               a[i][j] = 0;
                           }
                       }
                       else if (i < a.length - 1 && j == a[i].length - 1) {
                           if (a[i + 1][j] == 1) {
                               a[i][j] = 0;
                           }
                       }
                }
            }
        }

        for (int i = 0; i < a.length; i++) { //просто пересчитываем кол-во 1 в массиве
            for (int j = 0; j < a[i].length; j++) {
                    if (a[i][j] == 1)
                        count++;
            }
        }

        return count;
    }
}

                            /*
                            for (int i = 0; i < a.length; i++) {
                                for (int j = 0; j < a[i].length; j++) {
                                  System.out.print(a[i][j]);
                                }
                                System.out.println();
                             }

                            if (a[i + 1][j] == 1 && a[i][j + 1] == 1) {
                                a[i][j] = 0;
                           } else if (a[i + 1][j] == 1 && a[i][j + 1] == 0) {
                               a[i][j] = 0;
                           } else if (a[i + 1][j] == 0 && a[i][j + 1] == 1) {
                               a[i][j] = 0;
                           }
                            */

