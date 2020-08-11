package com.qa.day3;

public class Flowcharts {

    public static void main(String[] args) {
        method4day3();
    }

    public static int diagram1day3() {
        for (int A = 100; A <= 200; A++) {
            System.out.println("A");
        }
        return 0;
    }

    public static int diagram2day3() {
        for (int A = 100; A <= 200; A++) {
            if (A % 2 == 0) {
                System.out.println("-");
            } else {
                System.out.println("*");
            }
        }
        return 0;
    }

    public static int method3day3() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i * 10);
        }
        return 0;
    }

    public static int method4day3() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.println(i);
            }
        }
        return 0;
    }

}