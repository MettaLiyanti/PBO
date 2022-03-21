package com.example;

import java.util.Scanner;

public class AgeValidity {

    public static void main(String[] args) {
        
        //have users enter their age
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Masukkan umur Anda: ");
        int umur = inputScanner.nextInt();
        
        // declare a boolean variable, drivingUnderAge
        boolean pengemudiBawahUmur;
        
        // initialize drivingUnderAge to false
        pengemudiBawahUmur = false;
        
        // write boolean expression to check if the age
        // entered by the user is less than or equal to 18,
        // and then set drivingUnderAge to true
        if(umur<=18){
            pengemudiBawahUmur = true;
        }
        
        // print the value of drivingUnderAge
        System.out.println(pengemudiBawahUmur);
       
    }
}
