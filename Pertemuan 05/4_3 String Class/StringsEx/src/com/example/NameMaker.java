package com.example;
import java.util.Scanner;

public class NameMaker {
    
    public static void main(String[] args){
        String namaDepan, namaTengah, namaBelakang, namaLengkap;
        
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Masukkan nama depan Anda: ");
        namaDepan = inputScanner.next();
        System.out.print("Masukkan nama tengah Anda: ");
        namaTengah = inputScanner.next();
        System.out.print("Masukkan nama belakang Anda: ");
        namaBelakang = inputScanner.next();
        
//        // penggabungan dengan operator +
//        namaLengkap = namaDepan+" "+namaTengah+" "+namaBelakang;
//        System.out.println("Nama lengkap Anda: "+namaLengkap);
        
        // penggabungan dengan method concat()
        namaLengkap = namaDepan.concat(" "+namaTengah.concat(" "+namaBelakang));
        System.out.println("Nama lengkap Anda: " + namaLengkap);
        
    }
    
}
