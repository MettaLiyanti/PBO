package com.example;

public class ScholarshipNot {

    public static void main(String args[]) {
        int numDaysAbsent;
        int grade;
        
        numDaysAbsent = 2;
        grade = 65;
        
//        numDaysAbsent = 2;
//        grade = 90;
        
//        numDaysAbsent = 5;
//        grade = 65;
        
//        numDaysAbsent = 5;
//        grade = 90;
        
        boolean madeHonorRoll = grade >= 88;
        if (!madeHonorRoll && numDaysAbsent < 3) {
            System.out.println("You qualify for free tutoring help.");
        } 
    }  
}
