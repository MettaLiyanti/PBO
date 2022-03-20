package com.example;

import java.util.Scanner;

public class ComputeBMI {
    public static void main(String[] args){
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Masukkan berat badan Anda (kg): ");
        double bb = inputScanner.nextDouble();
        System.out.print("Masukkan tinggi badan Anda (cm): ");
        double tb = inputScanner.nextDouble();
        
        double imt = bb/Math.pow(tb/100, 2);
        System.out.println("Indeks Massa Tubuh (IMT) Anda = "+imt);
        
            
        
        }
}
