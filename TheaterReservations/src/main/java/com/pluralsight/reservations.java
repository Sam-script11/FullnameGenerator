package com.pluralsight;

import java.text.DateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class reservations {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System. in);
        System.out.print("Please enter your name: ");
        String name = keyboard.nextLine();

        System.out.print("What day will you be coming(MM/DD/YYYY): ");
        String date = keyboard.nextLine();

        System.out.print("How many tickets would you like? ");
        int tickets = keyboard. nextInt();
        DateTimeFormatter formatter;
        formatter = DateTimeFormatter.ofPattern("YYYY-MM-DD");

        if( tickets ==1){
            

        }




    }
}
