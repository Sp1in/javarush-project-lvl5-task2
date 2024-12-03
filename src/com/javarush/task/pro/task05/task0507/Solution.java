package com.javarush.task.pro.task05.task0507;

import java.util.Scanner;

/* 
Максимальное из N чисел

В этой задаче тебе нужно:

Ввести с клавиатуры число N.
Считать N целых чисел и заполнить ими массив array.
Найти максимальное число среди элементов массива.
Требования:
•	В методе main(String[]) считай с клавиатуры число N, потом проинициализируй массив array размером N элементов, и заполни числами с клавиатуры.
•	В методе main(String[]) выведи в консоль максимальное число среди элементов массива.
*/

public class Solution {
    public static int[] array;

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int scannerCount = scanner.nextInt();
        array = new int[scannerCount];
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        for (int k = 0; k < array.length; k++) {
            if (array[k] > max) {
                max = array[k];
            }
        }
        System.out.println(max);

    }
}
