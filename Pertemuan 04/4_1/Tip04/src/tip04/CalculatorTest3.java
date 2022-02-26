
package tip04;

public class CalculatorTest3 {
    public static void main(String[] args) {
        
        Calculator3 calc = new Calculator3();
        
        //Name your friends
        double total1 = calc.findTotal(10, null);
        double total2 = calc.findTotal(12, null);
        double total3 = calc.findTotal(9,  null);
        double total4 = calc.findTotal(8,  null);
        double total5 = calc.findTotal(7,  null);
        double total6 = calc.findTotal(15, "Alex");
        double total7 = calc.findTotal(11, null);
        double total8 = calc.findTotal(30, "Forgetful");

        //Find and print the entire table's total, including tax and tip
        System.out.println(total1+total2+total3+total4+total5+total6+total7+total8);
        // atau
        System.out.println(calc.entireTotal());
       
    } 
}
