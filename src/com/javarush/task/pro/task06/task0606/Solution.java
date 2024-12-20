package com.javarush.task.pro.task06.task0606;

/* 
Универсальный солдат


Неплохо было бы иметь один метод для решения различных задач. У тебя есть возможность написать такой.
Создай еще 9 методов universalMethod(). В сумме их должно получиться 10.
Параметры, которые они должны принимать, придумай сам.

Требования:
•	Программа должна содержать 10 методов с именем universalMethod.
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static void universalMethod(String name){
        System.out.println("Имя: " + name);
    }

    public static void universalMethod(String name, int age){
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
    }

    public static void universalMethod(String name, int age, boolean dick){
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
        System.out.println("Наличие члена: " + dick);
    }

    public static void universalMethod(String name, int age, boolean dick, int hands){
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
        System.out.println("Наличие члена: " + dick);
        System.out.println("Количество рук: " + hands);
    }

    public static void universalMethod(String name, int age, boolean dick, int hands, int legs){
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
        System.out.println("Наличие члена: " + dick);
        System.out.println("Количество рук: " + hands);
        System.out.println("Количество ног: " + legs);
    }

    public static void universalMethod(String name, int age, boolean dick, int hands, int legs, int eyes){
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
        System.out.println("Наличие члена: " + dick);
        System.out.println("Количество рук: " + hands);
        System.out.println("Количество ног: " + legs);
        System.out.println("Количество глаз: " + eyes);
    }

    public static void universalMethod(String name, int age, boolean dick, int hands, int legs, int eyes, boolean hair){
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
        System.out.println("Наличие члена: " + dick);
        System.out.println("Количество рук: " + hands);
        System.out.println("Количество ног: " + legs);
        System.out.println("Количество глаз: " + eyes);
        System.out.println("Наличие волос: " + hair);
    }

    public static void universalMethod(String name, int age, boolean dick, int hands, int legs, int eyes, boolean hair, String country){
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
        System.out.println("Наличие члена: " + dick);
        System.out.println("Количество рук: " + hands);
        System.out.println("Количество ног: " + legs);
        System.out.println("Количество глаз: " + eyes);
        System.out.println("Наличие волос: " + hair);
        System.out.println("Страна: " + country);
    }

    public static void universalMethod(String name, int age, boolean dick, int hands, int legs, int eyes, boolean hair, String country, String city){
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
        System.out.println("Наличие члена: " + dick);
        System.out.println("Количество рук: " + hands);
        System.out.println("Количество ног: " + legs);
        System.out.println("Количество глаз: " + eyes);
        System.out.println("Наличие волос: " + hair);
        System.out.println("Страна: " + country);
        System.out.println("Город: " + city);
    }

    public static void universalMethod(String name, int age, boolean dick, int hands, int legs, int eyes, boolean hair, String country, String city, String
            president){
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
        System.out.println("Наличие члена: " + dick);
        System.out.println("Количество рук: " + hands);
        System.out.println("Количество ног: " + legs);
        System.out.println("Количество глаз: " + eyes);
        System.out.println("Наличие волос: " + hair);
        System.out.println("Страна: " + country);
        System.out.println("Город: " + city);
        System.out.println("Твой любимый президент: " + president);
    }
}
