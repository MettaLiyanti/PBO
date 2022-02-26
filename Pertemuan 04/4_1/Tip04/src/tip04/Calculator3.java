
package tip04;

public class Calculator3 {
    public double tax = .05;
    public double tip = .15;
    public double entireTotal;
    
    //Include the cost of Alex's and Forgetful's meals in your calculations
    //Return the total after calculating
    public double findTotal(double price, String name){
        double total = price*(1+tax+tip);
        entireTotal = entireTotal+total;
        return total;
    }
    public double entireTotal(){
        return entireTotal;
    }
    

}
