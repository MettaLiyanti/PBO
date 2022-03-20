package processingname;

import java.util.Scanner;

public class ProcessName {
     
public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Masukkan nama Anda: ");
        
        // your code goes here
        // have the user enter a name
        String nama = console.nextLine();
        // extract the  first and last name from the name entered by the user
        int idxSpasi = nama.indexOf(" ");
        String namaDepan = nama.substring(0, 1);
        String namaBelakang = nama.substring(idxSpasi);
        // display the name to the console
        System.out.println("Nama Anda adalah: "+namaBelakang+", "+namaDepan+".");
        
        
    }
}