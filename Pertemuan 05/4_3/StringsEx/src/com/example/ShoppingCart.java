
package com.example;

public class ShoppingCart {
    public static void main (String[] args){
        String custName = "Steve Smith";
        String firstName;
        int spaceIdx;
        
        // Get the index of the space character (" ") in custName. 
        spaceIdx = custName.indexOf(" ");
           System.out.println("Spasi berada di indeks ke: "+spaceIdx);

        // Use the substring method parse out the first name and print it.
        firstName = custName.substring(0,spaceIdx);
        System.out.println("Nama pertama: "+firstName);

    }

    
}
