
package com.example;

public class StringIndexOf {

    public static void main(String args[]) {
        // method indexOf untuk menentukan nilai indeks atau posisi sebuah karakter dari string
        // indeks atau posisi karakter dalam string selalu diawali dari angka 0
        String phoneNum = "404-543-2345";
        System.out.println(phoneNum);
        
        int idx1 = phoneNum.indexOf('4');
        System.out.println("posisi angka 4 yang muncul pertama kali: " + idx1); // 0
        
        int idx2 = phoneNum.indexOf('4', 4);
        System.out.println("posisi angka 4 yang muncul mulai dari posisi ke 4: " + idx2); // 5
        
        // Contoh lain
        String kata = "\nular lari lurus";
        System.out.println(kata);
        
        int indeks1 = kata.indexOf('r');
        System.out.println("indeks dari huruf r yang pertama kali muncul: " + indeks1); // 3
        
        int indeks2 = kata.indexOf('r',7);
        System.out.println("indeks dari huruf r yang muncul mulai dari indeks ke 7: " + indeks2); // 7
        
        int indeks3 = kata.indexOf(' ');
        System.out.println("indeks dari spasi yang pertama kali muncul: " + indeks3);
    }

}
