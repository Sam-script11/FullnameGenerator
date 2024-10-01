package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);


        System.out.println("Please enter your name");

        System.out.print("first name: ");
        String firstName = keyboard.nextLine();

        System.out.print("Middle name: ");
        String middleName = keyboard.nextLine();

        System.out.println("last name: ");
        String lastName = keyboard.nextLine();


            System.out.println("Full name: " + firstName +" " + middleName+ " " + lastName);

        }
    }

