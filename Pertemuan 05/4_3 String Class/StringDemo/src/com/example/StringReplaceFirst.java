
package com.example;

public class StringReplaceFirst {

    public static void main(String[] args) {
        // method replaceFirst untuk mengganti suatu karakter/pola karakter yang muncul paling pertama
        String replace = "String replace with replaceFirst";
        String newString = replace.replaceFirst("re", "RE");
        System.out.println(newString);
        
        // contoh lain
        String twister = "Kuku kaki kakak-kakak dan kakek-kakekku kaku-kaku";
        String newTwister1 = twister.replaceFirst("K", "k");
        System.out.println(newTwister1);
        String newTwister2 = twister.replaceFirst("kak", "KAK");
        System.out.println(newTwister2);
        
    }

}
