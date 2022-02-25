
package tip03;

public class CalculatorTest {
    public static void main(String[] args) {

       /*This is what everyone owes before tax and tip:
       Person 1: $10
       Person 2: $12
       Person 3: $9
       Person 4: $8
       Person 5: $7
       Person 6: $15 (Alex)
       Person 7: $11
       Person 8: $30
       */
        
       Calculator calc = new Calculator();
       
       //Use the Calculator object and arguments supplied to findTotal()
       //to print the total for each person
//       calc.findTotal1(10);
//       calc.findTotal1(12);
//       calc.findTotal1(9);
//       calc.findTotal1(8);
//       calc.findTotal1(7);
//       calc.findTotal1(15);
//       calc.findTotal1(11);
//       calc.findTotal1(30);

        // Memanggil method yang bisa pass argumen nama
        calc.findTotal2("Person 1",10);
        calc.findTotal2("Person 2",12);
        calc.findTotal2("Person 3",9);
        calc.findTotal2("Person 4",8);
        calc.findTotal2("Person 5",7);
        calc.findTotal2("Person 6 (Alex)",15);
        calc.findTotal2("Person 7",11);
        calc.findTotal2("Person 8",30);
        
//        // mencari total seluruhnya
//        double person1 = calc.findTotal1(10);
//        double person2 = calc.findTotal1(12);
//        System.out.println(person1 + person2);
//            //tapi terjadi error karena tipe methodnya void
//            // solusinya ada di Tip04
        
    }    
}
