
package com.example;

import java.util.Random;

public class RandomNumSeed {
    public static void main(String[] args) {
        Random num = new Random(20);
        int randomNum = num.nextInt(30);
        System.out.println("Random Number: " + randomNum);
        num.setSeed(50);
        int randomNum2 = num.nextInt(30);
        System.out.println("Random Number: " + randomNum2);
        num.setSeed(20);
        int randomNum3 = num.nextInt(30);
        System.out.println("Random Number: " + randomNum3);
    }
}
