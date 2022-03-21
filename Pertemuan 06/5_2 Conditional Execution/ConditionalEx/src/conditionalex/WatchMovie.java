package conditionalex;

import java.util.Scanner;

public class WatchMovie {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the movie ticket price: $");
        double price = sc.nextDouble();
        System.out.print("Enter the film's rating: ");
        double rating = sc.nextDouble();
        if (price >= 12 && rating == 5){
            System.out.println("I'm interesting in watching the movie.");
        } else {
            System.out.println("I am not interested in watching the movie.");
        }

    }
}
