package input02;

import javax.swing.JOptionPane;

public class Input02 {
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null,
                "Halo, ini hanyalah bagian yang berisi pesan. Jadi tak perlu input.",
                "Judul: Pesan",
                1); // 0 tanda x, 1 tanda i, 2 tanda warning, 3 tanda ?

        
        String input1 = (String)JOptionPane.showInputDialog(null,
                "Apa kabar?",
                "Judul: Salam Kenal",
                3,
                null,
                null,
                "Luar biasa!!!");
        
        
        String[] pil = {"Koneksi internet seumur hidup dgn kecepatan tinggi", 
                "Makan, tidur, melakukan hobi sepuasnya tanpa diganggu", 
                "Punya pengetahuan yang luar biasa tentang dunia"};
        String input2 = (String)JOptionPane.showInputDialog(null,
                "Lebih memilih yang mana?",
                "Judul: Ayo pilih!",
                3,
                null,
                pil,
                pil[2]);
                
    }
}
