package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication { // application
    public static void main(String[] args) { // entry of the code
        Scanner keyboard = new Scanner(System.in);
        Cellphone deviceInput = new Cellphone(); // instatiting the class Cellphone with NEW and assigning deviceinput to the calss itself

        System.out.print("What is your serial number: ");
        double serialnumber = keyboard.nextDouble();
        deviceInput.setserialNumber(serialnumber);

        System.out.print("What model is the phone? ");
        String model = keyboard.next();
        deviceInput.setModel(model);

        System.out.print("who is the carrier? ");
        String carrier = keyboard.next();
        deviceInput.setCarrier(carrier);

        System.out.print("What is the phone number: ");
        String phoneNumber = keyboard.next();
        deviceInput.setPhoneNumber(phoneNumber);

        System.out.print("Who is the owner of the phone: ");
        String owner = keyboard.next();
        deviceInput.setOwner(owner);

        deviceInput.printCellPhoneIfo();



        }

        }


