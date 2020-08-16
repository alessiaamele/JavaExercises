package com.qa.day3;

public class UniqueSum {


    public static void main(String[] args) {
        System.out.println(input(1, 2, 3));
        System.out.println(input(3, 3, 3));
        System.out.println(input(1, 1, 2));
    }

    public static int input(int num1, int num2, int num3) {
        if (num1 != num2 && num2 != num3 && num3 != num1) {
            return num1 + num2 + num3;
        } else if (num1 == num2 && num2 == num3) {
            return 0;
        } else if (num1 == num2 && num2 != num3) {
            return num3;
        } else if (num1 == num3 && num2 != num3) {
            return num2;
        } else if (num2 == num3 && num1 != num3) {
            return num1;

        }
        else{
            return 0;
        }

    }
}
