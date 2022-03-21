package com.example;

public class ScholarshipAnd {

    public static void main(String[] args) {        
        int numberDayAbsent;
        int grade;
        
        numberDayAbsent = 0;
        grade = 95;
        
//        numberDayAbsent = 0;
//        grade = 87;
        
//        numberDayAbsent = 2;
//        grade = 95;
        
//        numberDayAbsent = 2;
//        grade = 87;
        
        if(grade >= 88 && numberDayAbsent == 0){
            System.out.println("You qualify for the scholarship.");
        } else {
            System.out.println("You do not qualify for the scholarship.");
        }
    }
}
