package com.qa.day2;

public class Calculator {


    public static void main(String[] args) {

        System.out.println(Sum(2,4));
        System.out.println(Multiplication(2,4));
        System.out.println(Subtraction(2,4));
        System.out.println(Division(2,4));

    }

    public static int Sum(int integer1, int integer2){
        int result = integer1 + integer2;
                return result;
    }

    public static int Multiplication(int integer1, int integer2){
        int result = integer1 * integer2;
        return result;
    }


    public static int Subtraction(int integer1, int integer2){
        int result = integer1 - integer2;
        return result;
    }

    public static double Division(double integer1, double integer2){
        if (integer1>integer2){
            double result = integer1 / integer2;
            System.out.println(result);
            return result;
        }
        else{
            System.out.println("Impossible to Execute");
            return 0;
        }
    }
}
