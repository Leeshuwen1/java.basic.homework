package ru.mulyukin.otus.java.basic.homework.homework3;

import java.sql.SQLOutput;

public class Apply {
    public static void main(String[] args) {

        int[][] arr = {{2, 59, 6}, {-9, 8, 13}, {1, 5, 1}};

        print(arr);
        System.out.println(sumPositiveElements(arr));

        square(10);

//        System.out.println();
//        zeroingDiagonal(arr);
//        print(arr);

        print(arr);
        System.out.println(findMax(arr));

        print(arr);
        System.out.println(sumSecondLine(arr));

    }

    public static int sumPositiveElements(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > 0)
                    sum += arr[i][j];
            }
        }
        return sum;
    }

    public static void square(int size) {
        int[][] arr = new int[size][size];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == 0 || j == 0 || i == arr.length - 1 || j == arr.length - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }





        public static int zeroingDiagonal ( int[][] arr){
            int zero = 0;
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if (i == j || i + j == arr.length - 1) {
                        arr[i][j] = zero;

                    }
                }
            }
            return zero;
        }

        public static void print ( int[][] arr){
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
//
        public static int findMax ( int[][] arr){
            int max = 0;
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if (arr[i][j] > max) {
                        max = arr[i][j];
                    }
                }
            }
            return max;
        }

        public static int sumSecondLine ( int[][] arr){
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if (arr.length < 2) {
                        return -1;
                    }else if (i == 2){
                        sum += arr[1][j];
                    }
                }
            }
            return sum;
        }
    }
















