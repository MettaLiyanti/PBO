package input03;

import java.util.Scanner;

class Input03 {

    public static void main(String[] args) {
        //Create a Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan bilangan 1: ");
        int bil1 = scanner.nextInt();
        System.out.print("Masukkan bilangan 2: ");
        int bil2 = scanner.nextInt();
        System.out.print("Masukkan bilangan 3: ");
        int bil3 = scanner.nextInt();
        //Find and print the sum of three integers entered by the user
        int total = bil1+bil2+bil3;
        System.out.println("Hasil penjumlahan: " + total);
        
        
        //Remember to close the Scanner
        scanner.close();
    }
}
