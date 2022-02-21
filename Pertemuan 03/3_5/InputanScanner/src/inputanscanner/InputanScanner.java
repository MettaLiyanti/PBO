package inputanscanner;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class InputanScanner {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan 1: ");
        int bil1  = input.nextInt();
        System.out.print("Masukkan bilangan 2: ");
        int bil2 = input.nextInt();
        int c = bil1 + bil2;
//        System.out.println("Hasil penjumlahan: "+c);
//        input.close();
        
        JOptionPane.showMessageDialog(null, 
                "Hasil penjumlahan: " + c, 
                "Judul", 1);
    }
    
}
