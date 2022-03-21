package com.example;

public class ScholarshipOr {

    public static void main(String[] args) {
        int numberDayAbsent;
        int grade;
       
//        numberDayAbsent = 3;
//        grade = 85;

//        numberDayAbsent = 3;
//        grade = 58;

//        numberDayAbsent = 6;
//        grade = 85;
        
        numberDayAbsent = 6;
        grade = 58;

        if(grade >= 70 || numberDayAbsent < 5){
            System.out.println("You qualify for a sports team");
        } else {
            System.out.println("You do not qualify for a sports team");
        }

    }
}