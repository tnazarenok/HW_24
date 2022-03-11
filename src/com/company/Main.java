package com.company;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task4();
        task5();
    }

    public static void task1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Написать программу которая будет обрабатывать ArithmeticException.");
        try {
            System.out.println("Введите числитель: ");
            int a = scanner.nextInt();
            System.out.println("Введите знаменатель: ");
            int b = scanner.nextInt();
            System.out.println("Ответ:" + a / b);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка! На ноль делить НЕЛЬЗЯ!");
        }
    }

    public static void task2() {
        System.out.println("2. Написать программу которая будет обрабатывать ClassCastException.");
        Object cat = "Murka";
        try {
            System.out.println((int) cat);
        } catch (ClassCastException e) {
            System.out.println("Недопустимое приведение типов");
        }
    }

    public static void task3() {
        System.out.println("Написать программу которая будет обрабатывать FileNotFoundException.");
    }
        public static void task4 () {
            System.out.println("4.Написать программу которая будет обрабатывать NumberFormatException.");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите слово: ");
            String word = scanner.nextLine();
            try {
                Integer.parseInt(word);
            } catch (NumberFormatException e) {
                System.out.println("Что-то пошло не так... Оказывается нам нужно было число:)");
            }
        }
        public static void task5 () {
            System.out.println("5. Написать программу которая будет обрабатывать ArrayIndexOutOfBoundsException.");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите значение: ");
            int num = scanner.nextInt();
            int[] array = new int[5];
            try {
                for (int i = 0; i < array.length - 1; i++) {
                    array[num + 1] = num;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Вы вышли за границы массива!");
            }

            System.out.println(Arrays.toString(array));
        }
    }

