package com.example;

import java.util.Random;

public class RockPaperScissor {

    public static void main(String[] args) {
        Random rand = new Random();
        int acak = rand.nextInt(3);
        System.out.println(acak);
        
        if(acak==0){
            System.out.println("Batu");
        } else if(acak==1){
            System.out.println("Gunting");
        } else {
            System.out.println("Kertas");
        }
                            

    }
}
