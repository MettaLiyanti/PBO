package input01;

import javax.swing.JOptionPane;

public class Input01 {
    public static void main(String[] args) {
        //Create a JOptionPane.
        //Store the input as a String and print it.
        String input = JOptionPane.showInputDialog("Ketikkan sesuatu: ");
        System.out.println(input);        
        
        
        //Parse the input as an int.
        int inputInt = Integer.parseInt(input);
        //Print its value +1
        System.out.println(inputInt + 1);
        
        
        //Try creating a dialog, parsing it, and initializing an int in a single line.
        //You should have only one semicolon (;) in this line.
        int input2 = Integer.parseInt(JOptionPane.showInputDialog("Ketikkan lagi: "));
        System.out.println(input2);
        
    }
}
