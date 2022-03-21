package com.example;

public class EqualityString3 {
    public static void main(String args[]) {
        String name1 = new String("Fred Smith");
        String name2 = new String("Fred Smith");

        if (name1 == name2) {
            System.out.println("Same name.");
        } else {
            System.out.println("Different name.");
        }

    }
    
}
