package com.pluralsight;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Score {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("please enter a game score: ");
        String input = keyboard.nextLine();

        String [] tokens1 = input.split(Pattern.quote(":"));
        String [] tokens2 = input.split(Pattern.quote("|"));
        String [] tokens3 = input.split(Pattern.quote(":"));
        String Home = tokens1[0];
        String Away = tokens2[1];
        int homeScore = Integer.parseInt(tokens3[0]);
        int awayScore = Integer.parseInt(tokens3[1]);

        if( homeScore>awayScore){
            System.out.println("Winner: "+ homeScore);
        } else{
            System.out.println("Winner: " + awayScore);
        }





//        String input = "111|Hot Chocolate (12-count)|21|4.99";
//        String[] tokens = input.split(Pattern.quote("|"));
//        int id = Integer.parseInt(tokens[0]);
//        String name = tokens[1];
//        int quantity = Integer.parseInt(tokens[2]);
//        double price = Double.parseDouble(tokens[3]);



    }
}
