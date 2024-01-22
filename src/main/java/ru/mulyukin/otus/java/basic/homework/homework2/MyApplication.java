package ru.mulyukin.otus.java.basic.homework.homework2;

import java.util.Arrays;

public class MyApplication {
    public static void main(String[] args) {

        acceptNumberAntWord(1, "Otus");
        sumArray(3, 6, 89, 9, 3, 4, 6);
        fillingArray(4, new int[10]);
        increaseTheNumber(2, 4, 4, 3, 1, 2, 7, 0, 7, 5, -4);
        sumHalfPastArray(3, 109, 5, 9, 1, 6, 9, 5, 8, 4);
        sumSomeArrays();

    }

    public static void acceptNumberAntWord(int a, String b) {
        for (int i = 0; i < a; i++) {
            System.out.println(b);
        }
    }

    public static void sumArray(int... arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 5) {
                sum += arr[i];
            }
        }
        System.out.println(sum);
    }

    public static void fillingArray(int count, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = count;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void increaseTheNumber(int a, int... arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += a;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void sumHalfPastArray(int... arr) {
        int sum = 0;
        int sum1 = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            sum += arr[i];
        }
        for (int i = arr.length / 2; i < arr.length; i++) {
            sum1 += arr[i];
        }
        if (sum > sum1) {
            System.out.println("Сумма левой половины " + "= " + sum);
        } else {
            System.out.println("Сумма правой половины " + "= " + sum1);
        }

    }

    public static void sumSomeArrays() {
        int[] arr = {2, 4, 5, 6};
        int[] arr1 = {3, 5, 8, 9};
        int[] arr3 = {2, 3, 5, 1};
        int[] sumArrays = new int[arr.length];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sumArrays[i] = arr[i] + arr1[i] + arr3[i];
            sum += sumArrays[i];
        }
        System.out.println(Arrays.toString(sumArrays));
        System.out.println(sum);
    }

}
