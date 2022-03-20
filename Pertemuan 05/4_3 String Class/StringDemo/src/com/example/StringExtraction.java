
package com.example;

public class StringExtraction {

    public static void main(String args[]) {
        // method substring untuk mengekstrak substring dari string
        String greeting = "Hello, World!";
        String sub = greeting.substring(0, 5);
        System.out.println(sub);
        String w = greeting.substring(7, 11);
        System.out.println(w);
        String tail = greeting.substring(7);
        System.out.println(tail);
        
        // contoh lain
        String perintah = "Dudung, tolong ambilkan dandang di dinding dong, Dung!";
        System.out.println(perintah.substring(12));
        System.out.println(perintah.substring(0,12));
        System.out.println(perintah.substring(12,16));
                
    }

}
