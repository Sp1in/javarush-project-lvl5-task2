package com.javarush.task.pro.task05.task0509;

/* 
Таблица умножения

Проинициализируй массив MULTIPLICATION_TABLE значением new int[10][10], заполни его таблицей умножения и выведи в консоли в следующем виде:
1 2 3 4 …
2 4 6 8 …
3 6 9 12 …
4 8 12 16 …
…
Числа в строке разделены пробелом.
*/

public class Solution {

    public static int[][] MULTIPLICATION_TABLE;

    public static void main(String[] args) {

        MULTIPLICATION_TABLE = new int[10][10] ; // ширина 10, высота 10

        int count1 = 1;
        for (int c = 0; c < MULTIPLICATION_TABLE.length; c++) {
            int count2 = 1;
            for (int b = 0; b < MULTIPLICATION_TABLE.length; b++) {
                MULTIPLICATION_TABLE[c][b] = count1 * count2;
                count2++;
            }
            count1++;
        }

        String space = " ";
        for (int a = 0; a < MULTIPLICATION_TABLE.length; a++) {
            for (int i = 0; i < MULTIPLICATION_TABLE.length; i++) {
                System.out.print(MULTIPLICATION_TABLE[a][i] + space);
            }
            System.out.println();
        }



    }
}
