
package tip01;

public class Tip01 {
    public static void main(String[] args) {
        //Find everyone's indivudlal total after tax(5%) and tip(15%)
        
        /*This is what everyone owes before tax and tip:
        Person 1: $10
        Person 2: $12
        Person 3: $9
        Person 4: $8
        Person 5: $7
        Person 6: $15
        Person 7: $11
        Person 8: $30
        */
        
        double tax = 0.05;
        double tip = 0.15;
        
        double total1 = 10 * (1+tax+tip);
        System.out.println("Person 1: $"+total1);
        
        double total2 = 12 * (1+tax+tip);
        System.out.println("Person 2: $"+total2);
        
        double total3 = 9 * (1+tax+tip);
        System.out.println("Person 3: $"+total3);
        
        double total4 = 8 * (1+tax+tip);
        System.out.println("Person 4: $"+total4);
        
        double total5 = 7 * (1+tax+tip);
        System.out.println("Person 5: $"+total5);
        
        double total6 = 15 * (1+tax+tip);
        System.out.println("Person 6: $"+total6);
        
        double total7 = 11 * (1+tax+tip);
        System.out.println("Person 7: $"+total7);
        
        double total8 = 30 * (1+tax+tip);
        System.out.println("Person 8: $"+total8);
    }    
}
