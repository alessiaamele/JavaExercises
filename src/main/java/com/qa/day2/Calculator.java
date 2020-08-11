package com.qa.day2;

public class Calculator {


    public static void main(String[] args) {

        System.out.println(Method1day2bis(2,4));
        System.out.println(Method2day2bis(2,4));
        System.out.println(Method3day2bis(2,4));
        System.out.println(Method4day2bis(2,4));

    }

    public static int Method1day2bis(int integer1, int integer2){
        int result = integer1 + integer2;
                return result;
    }

    public static int Method2day2bis(int integer1, int integer2){
        int result = integer1 * integer2;
        return result;
    }


    public static int Method3day2bis(int integer1, int integer2){
        int result = integer1 - integer2;
        return result;
    }

    public static double Method4day2bis(double integer1, double integer2){
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
