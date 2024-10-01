package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);


        System.out.println("Please enter your name");

        System.out.print("first name: " );
        String firstName = keyboard.next();

        System.out.println("Middle name: ");
        String middleName = keyboard.next();

        System.out.println("last name: ");
        String lastName = keyboard.next();

        String name = "firstName|middleName|lastName";
        String [] FullName = name.split("\\|");
        System.out.println(name);

    }
}
