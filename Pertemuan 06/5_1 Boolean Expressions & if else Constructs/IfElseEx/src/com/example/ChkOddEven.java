package com.example;

import java.util.Scanner;

public class ChkOddEven {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        
        if((num % 2)==0){
            System.out.println("The num is even "+num);
        }
        
        if((num % 2)!=0){
            System.out.println("The num is odd "+num);
        }
        
    }
}
