package com.qa.day2;

public class Results {

    public static void main(String[] args) {
        System.out.println(Method1(120,130,140));
        System.out.println(Method2(120,130,140));
    }

    public static int Method1(int chemGrade, int phyGrade, int bioGrade){
        System.out.println("Chemistry grade:"+ chemGrade);
        System.out.println("Physics grade:"+ phyGrade);
        System.out.println("Biology grade:"+ bioGrade);
        System.out.println("Total grade:");
        int totalGrade = chemGrade + phyGrade + bioGrade;
        return totalGrade;
    }

    public static int Method2(int chemGrade, int phyGrade, int bioGrade){
        int totalGrade = chemGrade + phyGrade + bioGrade;
        int overallGrade = totalGrade*100/450;
        System.out.println("Overall grade:");
        return overallGrade;
    }
}
