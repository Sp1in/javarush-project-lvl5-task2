package com.javarush.task.pro.task05.task0508;

import java.util.Scanner;

/* 
Удаляем одинаковые строки

Считать 6 строк и заполнить ими массив strings.
Удалить повторяющиеся строки из массива strings, заменив их на null (null должны быть не строками "null").
*/

public class Solution {
    public static String[] strings;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        strings = new String[6];
        for (int a = 0; a < strings.length; a++) {
            strings[a] = scanner.nextLine();
        }

        for (int i = 0; i < strings.length; i++) {
            String currentString = strings[i];
            for (int j = i + 1; j < strings.length; j++) {
                if (currentString == null) {
                    break;
                }
                if (currentString.equals(strings[j])) {
                    strings[j] = null;
                    strings[i] = null;
                }
            }
        }

        /*

        for (int count = 0; count < strings.length; count++) {
            for (int b = 1; b < strings.length; b++) {
                if (strings[count].equals(strings[b]) && count != b) {
                        strings[count] = "dell";
                        strings[b] = "dell";
                }
            }
        }

        for (int d = 0; d < strings.length; d++) {
            if (strings[d].equals("dell")) {
                strings[d] = null;
            }
        }

         */


        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");
        }
    }
}
