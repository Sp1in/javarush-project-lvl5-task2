package com.javarush.task.pro.task05.task0511;

import java.util.Scanner;

/* 
Создаем двумерный массив

Двумерный массив — это массив массивов, то есть в каждой его ячейке находится ссылка на некий массив. Но гораздо проще его представить в виде таблицы, у которой задано количество строк (первое измерение) и количество столбцов (второе измерение). В этой задаче мы будем создавать такой массив.

Для этого реализуй метод main(String[]), который:

Считывает из консоли число N — количество строк массива (считай, что это число будет больше 0, можно не проверять).
Считывает N чисел из консоли (любые числа, которые будут больше 0, можно не проверять).
Инициализирует двумерный массив multiArray:
количеством строк N;
строки — массивами, размер которых соответствует числам, введенным в п.2 (в порядке ввода).
*/

public class Solution {
    public static int[][] multiArray;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int scannerStringNumber = scanner.nextInt();
        multiArray = new int[scannerStringNumber][];
        for (int i = 0; i < multiArray.length; i++) {
            multiArray[i] = new int[scanner.nextInt()];
        }

    }
}
