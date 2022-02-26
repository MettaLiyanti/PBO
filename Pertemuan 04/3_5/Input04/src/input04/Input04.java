package input04;

import java.util.Scanner;

public class Input04 {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(Input04.class.getResourceAsStream("input04text.txt"));      
        
        //Edit these lines to advance the scanner
        sc.nextLine();
        sc.nextLine(); // menambah method nextLine sekali lagi
        System.out.println(sc.nextLine()); // di sini sudah melewati line 3,
            // makanya dia mencetak "Line3"
            // dan sekarang scanner berada di line 4   
        
        //Does this line contain "BlueBumper"?
        System.out.println(sc.findInLine("BlueBumper")); // karena skrg ada di line 4,
            // makanya bisa ditemukan kata "BlueBumper"
        
        //Store the next two numbers as xPosition and yPosition
        int xPosition = Integer.parseInt(sc.findInLine("90"));
            // scanner masih di line 4, jadi angka "90" masih bisa ditemukan
            // kemudian "90" di-parse menjadi int dan disimpan dalam variabel
        int yPosition = Integer.parseInt(sc.findInLine("120"));
            // sama seperti yg xPosition
        
        //Print these positions        
        System.out.println("X: " + xPosition + ", Y: " + yPosition);
        
        sc.close();
    }    
}
