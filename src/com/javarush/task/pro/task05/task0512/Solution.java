package com.javarush.task.pro.task05.task0512;

/* 
Создаем мультимассив

В методе main(String[]) выведи на экран все числа из трехмерного массива multiArray.
*/

public class Solution {

    public static int[][][] multiArray = new int[][][]{{{4, 8, 15}, {16}}, {{23, 42}, {}}, {{1}, {2}, {3}, {4, 5}}};

    public static void main(String[] args) {

        for (int i = 0; i < multiArray.length; i++) {
            for (int a = 0; a < multiArray[i].length; a++) {
                for (int b = 0; b < multiArray[i][a].length; b++) {
                    System.out.print(multiArray[i][a][b] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

    }
}

