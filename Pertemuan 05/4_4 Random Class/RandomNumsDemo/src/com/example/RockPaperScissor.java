package com.example;

import java.util.Random;

public class RockPaperScissor {

    public static void main(String[] args) {
        Random rand = new Random();

        int num = rand.nextInt(3);
        if (num == 0) {
            System.out.println("Rock");
        } else if (num == 1) {
            System.out.println("Paper");
        } else {
            System.out.println("Scissors");
        }

    }
}
