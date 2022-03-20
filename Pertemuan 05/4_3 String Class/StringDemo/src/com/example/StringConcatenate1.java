package com.example;

public class StringConcatenate1 {

    public static void main(String[] args) {
        // penggabungan string dengan method concat()
        String myString = "Hello";
        myString = myString + "!";
            System.out.println(myString);
        //myString = myString.concat(8); //error karna tidak boleh int, harus string
        myString = myString.concat("8");    
            System.out.println(myString);
            
        // contoh lain
        String tes = "tes";
        //tes = tes.concat(123); // error karna tipe data int
            System.out.println(tes);
        tes = tes.concat("123");
            System.out.println(tes);
        
    }
}
