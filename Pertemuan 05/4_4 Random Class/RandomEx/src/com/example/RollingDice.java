package com.example;

import java.util.Random;

public class RollingDice {

    public static void main(String[] args) {
        Random random = new Random();
        int angkaAcak = random.nextInt(6)+1;
        System.out.println("Angka dadu yang muncul: "+angkaAcak);
        
    }

}
