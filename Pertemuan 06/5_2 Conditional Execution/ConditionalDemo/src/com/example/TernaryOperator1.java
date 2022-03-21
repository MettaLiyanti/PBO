package com.example;

public class TernaryOperator1 {

    public static void main(String args[]) {
        int numberOfGoals;
//        numberOfGoals = 1;
        numberOfGoals = 3;
        
//        String s = (numberOfGoals == 1 ? "goal" : "goals");
//        System.out.println("I scored " + numberOfGoals + " " + s);

        System.out.println("I scored " + numberOfGoals + " " +
                            (numberOfGoals == 1 ? "goal" : "goals"));

    }
}
