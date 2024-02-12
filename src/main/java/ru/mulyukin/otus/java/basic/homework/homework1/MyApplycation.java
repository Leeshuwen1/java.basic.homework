package ru.mulyukin.otus.java.basic.homework.homework1;
import java.util.Scanner;
public class MyApplycation {
    public static void main(String[] args) {
        greating();
        checkSign(-15, 6, 4);
        selectColor();
        compareNumbers();
        addOrSubtractAndPrint(4, 6, false);
        enteringRandom();

    }

    public static void greating() {
        System.out.println("Hello");
        System.out.println("World");
        System.out.println("from");
        System.out.println("Java");
    }

    public static void checkSign(int a, int b, int c) {
        int d = a + b + c;
        if (d >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void selectColor() {
        int data = 17;
        if (data <= 10) {
            System.out.println("Красный");
        } else if (data <= 20) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }

    }

    public static void compareNumbers() {
        int a = 2;
        int b = 6;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }

    }

    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        if (increment) {
            System.out.println(initValue + delta);
        } else {
            System.out.println(initValue - delta);
        }
    }

    public static void enteringRandom() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int a = scanner.nextInt();
        int tnd = (int) (Math.random() * a);
        System.out.println(tnd);
    }
}

