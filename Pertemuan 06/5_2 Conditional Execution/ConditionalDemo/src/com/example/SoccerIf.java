package com.example;

public class SoccerIf {

    public static void main(String args[]) {
        int numberOfGoals = 3;
        String s;
        if (numberOfGoals == 1) {
            s = "goal";
        } 
        else {
            s="goals";
        }
        System.out.println("I scored " + numberOfGoals + " " + s);

    }
}
