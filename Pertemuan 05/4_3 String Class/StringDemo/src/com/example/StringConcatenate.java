package com.example;

public class StringConcatenate {
 
 public static void main(String args[]){  
   // penggabungan string dengan operator +
   String s1="Susan";  
   String s2="Roberts";
   s1=s1+s2;
     System.out.println(s1);
   
   // contoh lain
   String coba = "Tes"+123;
     System.out.println(coba); // Tes123
   String cobaLagi = "Tes"+1+2+3;
     System.out.println(cobaLagi); // Tes123
   String cobaLagi2 = "Tes"+1+(2+3);
     System.out.println(cobaLagi2); // Tes15
  
 }  
} 
    

