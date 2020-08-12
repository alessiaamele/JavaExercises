package com.qa.day4;

public class Conditionals {

    public static void main(String[] args) {
        System.out.println(exercise1Day4(1,2,true));
        System.out.println(exercise1Day4(1,2,false));
        System.out.println(exercise1Day4(3,4,true));
        System.out.println(exercise1Day4(3,4,false));
    }

    public static int exercise1Day4(int int1, int int2, boolean boolean1){
        if (boolean1){
            return int1+int2;
        }
        else {
            return int1*int2;
        }

    }




    }
