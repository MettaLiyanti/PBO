
package inputan;

import javax.swing.JOptionPane;

public class Inputan {

    public static void main(String[] args) {
        
//        String input = JOptionPane.showInputDialog("Nama Anda?");
//        System.out.println("Halo, " + input);
        
//        String input = (String) JOptionPane.showInputDialog(null, 
//            "Masukkan nilai integer: ", 
//            "Judulnya",
//            1, 
//            null, 
//            null, 
//            "0" );
//        System.out.println("Nilai input integer Anda: " + input);
                
        String[] nmBuah = {"jambu", "pisang", "jeruk"}; 
        String buahKesukaan = (String)JOptionPane.showInputDialog(null, 
                "Pilih buah kesukaan Anda : ", 
                "Pilihan", 
                3, // 0 tanda x, 1 tanda i, 2 tanda warning, 3 tanda ?
                null, 
                nmBuah, 
                nmBuah[1]);
   
        JOptionPane.showMessageDialog(null, "Anda suka buah "+buahKesukaan, "Jawaban",1);
        
        
        }
    }