package com.example;

import java.util.Scanner;

public class StringEquality {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a name: ");
        String name = sc.next();
        
        if(name.equalsIgnoreCase("Moe")){
            System.out.println("You are the king of rock and roll");
        } else {
            System.out.println("You are not the king");
        }
        
    }
       
}

