package com.example;

public class EqualityString1 {

    public static void main(String args[]) {
        String name1 = "Fred Smith";
        String name2 = "fred smith";
        
        if (name1.equalsIgnoreCase(name2)) {
            System.out.println("Same name.");
        } else {
            System.out.println("Different name.");
        }
    }
}


