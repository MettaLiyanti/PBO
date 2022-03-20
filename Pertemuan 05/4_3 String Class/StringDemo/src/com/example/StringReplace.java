
package com.example;

public class StringReplace {

    public static void main(String[] args) {
        // method replace untuk mengganti suatu karakter/pola karakter
        String replace = "Using String replace to replace character";
        String newString = replace.replace("r", "R");
        System.out.println(newString);
        
        // contoh lain
        String kalimat = "Engkau ulung guling ulang ulas guling";
        String kalimatBaru1 = kalimat.replace("ul", "UL");
        System.out.println(kalimatBaru1);
        String kalimatBaru2 = kalimat.replace(" ","_");
        System.out.println(kalimatBaru2);
       
    }

}
