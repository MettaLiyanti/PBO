package javaclass;

import java.util.Random;
import java.util.Scanner;

public class RandomClass {
    public static void cariAcak(){
        Random acak = new Random();
        
//        int acakInt = acak.nextInt();
//            System.out.println("nilai int acak: " + acakInt);
//        boolean acakBool = acak.nextBoolean();
//            System.out.println("nilai boolean acak: "+acakBool);
//        long acakLong = acak.nextLong();
//            System.out.println("ni lai long acak: "+acakLong);
//        float acakFloat = acak.nextFloat();
//            System.out.println("nilai acak float: "+acakFloat);
//        double acakDouble = acak.nextDouble();
//            System.out.println("nilai acak double: "+acakDouble);

        // cara membatasi range (rentang) angka 
//        int rangeAcak = acak.nextInt(10);
//            System.out.println("nilai acak dari 0-9: "+rangeAcak);
//        int rangeAcak2 = acak.nextInt(10)+1;
//            System.out.println("nilai acak dari 1-10: "+rangeAcak2);
//        int rangeAcak3 = acak.nextInt(10)+2;
//            System.out.println("nilai acak dari 2-11: "+rangeAcak3);
//        int rangeAcak4 = acak.nextInt(35)+44;
//            System.out.println("nilai acak dari 44-78: "+rangeAcak4);

//        Scanner numberScanner = new Scanner (System.in);
//        System.out.print("Masukkan angka antara 1 sampai 10: ");
//        int userNum = numberScanner.nextInt();
//        int winningNum = acak.nextInt(10)+1;
//        System.out.println("Angka Anda: "+userNum);
//        System.out.println("Angka pemenangnya adalah: "+winningNum);
//        if(userNum==winningNum){
//            System.out.println("SELAMAT ANDA MENANG!!!");
//        }  else {
//            System.out.println("Anda belum beruntung...Silakan coba lagi");
//        }
        
        // seed
        Random rand = new Random(22L);
        System.out.println("Random Number 1: "+rand.nextInt(100));
        System.out.println("Random Number 2: "+rand.nextInt(100));
        System.out.println("Random Number 3: "+rand.nextInt(100));
        System.out.println("Changing seed to change to sequence");
        rand.setSeed(10L);
        System.out.println("Random Number 4: "+rand.nextInt(100));
        System.out.println("Random Number 5: "+rand.nextInt(100));
        System.out.println("Random Number 6: "+rand.nextInt(100));
        System.out.println("Setting seet 22 produce previous sequence");
        rand.setSeed(22L);
        System.out.println("Random Number 7: "+rand.nextInt(100));
        System.out.println("Random Number 8: "+rand.nextInt(100));
        System.out.println("Random Number 9: "+rand.nextInt(100));
        
    }
}
