package com.example;

public class TestClass {

    public static void main(String args[]) {
        
        //Create an instance of ComputeMethods, 
        ComputeMethods hitung = new ComputeMethods();
        
        //invoke the 3 methods and dispay their results
        System.out.println("Suhu dalam Celcius: "+hitung.fKeC(50));
        System.out.println("Sisi miring: "+hitung.sisiMiring(4,3));
        System.out.println("Jumlah nilai dadu: "+hitung.nilaiDadu());
    }
}
