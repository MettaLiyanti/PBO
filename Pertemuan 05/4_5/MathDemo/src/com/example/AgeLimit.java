package com.example;

import java.util.Scanner;

public class AgeLimit {
   public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();
      //age=Math.max(age,0);
      age=Math.min(40, age);
       System.out.println("Age is "+age);
    } 
}
