package com.example;

import java.util.Random;

public class ComputeMethods {
    
    public double fKeC(double suhuF){
        double suhuC = 5/9.0 *(suhuF-32);
        
        return suhuC;
    }
    
    public double sisiMiring(int a, int b){
        double c = Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        
        return c;
    }
    
    public int nilaiDadu(){
        Random acak = new Random();
        int dadu1 = acak.nextInt(6)+1;
        int dadu2 = acak.nextInt(6)+1;
        int jum = dadu1 + dadu2;
        
        return jum;
    }
    
    
}

