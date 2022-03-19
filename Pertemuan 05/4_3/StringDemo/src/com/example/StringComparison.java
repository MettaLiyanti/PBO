
package com.example;

public class StringComparison {

    public static void main(String[] args) {
        // method compareTo untuk membandingkan string sesuai urutan seperti pada kamus
        String s1 = "Susan";
        String s2 = "Susan";
        String s3 = "Robert";
        System.out.println(s1.compareTo(s2));//0  
        System.out.println(s1.compareTo(s3));//1(because s1>s3)  
        System.out.println(s3.compareTo(s1));//-1(because s3 < s1 )  
        
        System.out.println("kaki".compareTo("kakak")); //8
        System.out.println("kaki".compareTo("kakek")); //4
        System.out.println("kaki".compareTo("kaku")); //-12
        
        System.out.println("a".compareTo("b")); //-1
        System.out.println("a".compareTo("c")); //-2
        System.out.println("a".compareTo("d")); //-3
        System.out.println("a".compareTo("e")); //-4
        System.out.println("a".compareTo("z")); //-25
        
    }

}
