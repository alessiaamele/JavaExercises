package com.qa.day4;

public class PeerProgramming3 {

    public static void main(String[] args) {
        calc2(2,4,6,3);
        calc2(4, 4, 3, 4);
        calc2(8, 4, 3, 6);
        calc2(9, 3, 1, 7);
    }

    public static void calc2(double a, double b, double c, double d){
        if ((a+b)*c==d){
            System.out.println(a + "+" + b + "*" + c + "="+d);
        }
        if ((a-b)*c==d){
            System.out.println(a + "-" + b + "*" + c + "="+d);
        }
        if ((a/b)*c==d){
            System.out.println(a + "/" + b + "*" + c + "="+d);
        }
        if ((a*b)*c==d){
            System.out.println(a + "+" + b + "*" + c + "="+d);
        }


        if ((a+b)/c==d){
            System.out.println(a + "+" + b + "/" + c + "="+d);
        }
        if ((a-b)/c==d){
            System.out.println(a + "-" + b + "/" + c + "="+d);
        }
        if ((a/b)/c==d){
            System.out.println(a + "/" + b + "/" + c + "="+d);
        }
        if ((a*b)/c==d){
            System.out.println(a + "*" + b + "/" + c + "="+d);
        }



        if ((a+b)+c==d){
            System.out.println(a + "+" + b + "+" + c + "="+d);
        }
        if ((a-b)+c==d){
            System.out.println(a + "-" + b + "+" + c + "="+d);
        }
        if ((a/b)+c==d){
            System.out.println(a + "/" + b + "+" + c + "="+d);
        }
        if ((a*b)+c==d){
            System.out.println(a + "*" + b + "+" + c + "="+d);
        }


        if ((a+b)-c==d){
            System.out.println(a + "+" + b + "-" + c + "="+d);
        }
        if ((a-b)-c==d){
            System.out.println(a + "-" + b + "-" + c + "="+d);
        }
        if ((a/b)-c==d){
            System.out.println(a + "/" + b + "-" + c + "="+d);
        }
        if ((a*b)-c==d){
            System.out.println(a + "*" + b + "-" + c + "="+d);
        }


        }
    }

