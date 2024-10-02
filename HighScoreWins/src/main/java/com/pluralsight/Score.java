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

        String Home = tokens2[1];

        String [] homeScore = Home.split(Pattern.quote(":"));
        String score = tokens2[0];
        String[] awayScore = score.split(Pattern.quote(":"));

        String a1 = awayScore[0];
        String a2 = awayScore[1];

        int num1 = Integer.parseInt(homeScore[0]);
        int num2 = Integer. parseInt(tokens1[2]);



        if(num1 > num2){
            System.out.printf("Winner: %s",a1);
        }else {
            System.out.printf("Winner %s",a2);
        }






    }
}
