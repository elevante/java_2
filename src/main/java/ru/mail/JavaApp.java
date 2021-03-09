package ru.mail;

import java.util.Arrays;

public class JavaApp {
    public static void main(String[] args) {
        inventArray();
        fillArray();
        changeArray();
        fillDiagonal();
        maxMinArray();
    }
/*
    Task 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
    Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    С помощью цикла и условия заменить 0 на 1, 1 на 0;
*/
    public static void inventArray() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0)
                arr[i] = 1;
            else
                arr[i] = 0;
        }
        System.out.println(Arrays.toString(arr));
    }
/*
    Task 2. Задать пустой целочисленный массив размером 8.
    С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
*/
    public static void fillArray() {
        int[] arr = new int[8];
        for (int i = 0, k = 0; i < arr.length; i++, k += 3) {
            arr[i] = k;
        }
        System.out.println(Arrays.toString(arr));
    }
/*
    Task 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
    ройти по нему циклом, и числа меньшие 6 умножить на 2;
*/
    public static void changeArray() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6)
                arr[i] = arr[i] * 2;
        }
        System.out.println(Arrays.toString(arr));
    }
/*
    Task 4. Создать квадратный двумерный целочисленный массив
    (количество строк и столбцов одинаковое),
    и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
*/
    public static void fillDiagonal() {
        int[][] arr = new int[5][5];
        int k = arr.length-1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++)
            {
                if (i == j)
                    arr[i][j] = 1;
                if(j == k)
                    arr[i][k] = 1;
                System.out.print(arr[i][j] + " ");
            }
            k--;
            System.out.println();
        }
    }
/*
    Task 5. Задать одномерный массив и найти в нем минимальный и максимальный элементы.
*/
    public static void maxMinArray() {
        int[] arr = {10, 3, 4, 5, 6, 1, 7};
        int[] min = new int[1];
        int[] max = new int[1];
        min[0] = arr[0];
        max[0] = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(min[0] > arr[i])
                min[0] = arr[i];
            else if (max[0] < arr[i])
                max[0] = arr[i];
        }
        System.out.println(Arrays.toString(min) + " = минимальное число");
        System.out.println(Arrays.toString(max) + " = максимальное число");
    }

}