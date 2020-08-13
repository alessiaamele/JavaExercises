package com.qa.day4;

public class PeerProgramming {

    public static void main(String[] args) {
        puppy(5);

    }

    public static void puppy(int x){
        for (int i=1; i<=100; i++){
            if (i==x){
                continue;
            }

            if (i % 10 == 1) {
                System.out.println(i + "st");

            } else if (i % 10 == 2) {
                System.out.println(i + "nd");

            } else if (i % 10 == 3) {
                System.out.println(i + "rd");

            } else {
                System.out.println(i + "th");

            }
        }

    }
}


