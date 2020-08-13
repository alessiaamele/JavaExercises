package com.qa.day4;

public class Conditionals {

    public static void main(String[] args) {
        System.out.println(exercise2Day4(500));

    }

    public static int exercise1Day4(int int1, int int2, boolean boolean1){
        if (boolean1){
            return int1+int2;
        }
        else {
            return int1*int2;
        }

    }

    public static int exercise2Day4(int a){
        if (a>2000){
            System.out.println("A");
                    if (a>6000){
                        System.out.println("C");
                    }
                    else if(a>4000){
                        System.out.println("D");
                    }
                    else{
                        System.out.println("E");
                    }
            }
        else {
            System.out.println(1);
            if (a > 100) {
                System.out.println(3);
                if (a > 600) {
                    System.out.println(5);
                } else {
                    System.out.println(4);
                    if (a > 500) {
                        System.out.println(6);
                    } else {
                        System.out.println(7);
                    }
                }
            } else {
                System.out.println(2);
            }
        }
        return 0;
    }}
