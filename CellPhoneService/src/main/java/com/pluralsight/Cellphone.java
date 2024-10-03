package com.pluralsight;

public class Cellphone {
    private double serialNumber;
    private String Model, carrier, owner, phoneNumber;
    public Cellphone() {
        this.serialNumber = 0.0;
        this.Model = "";
        this.carrier = "";
        this.phoneNumber = "";
        this.owner = "";

    }

    public void setserialNumber(double serialNumber) {
        this.serialNumber = serialNumber;
    }
    public void setModel(String Model){
        this.Model = Model;
    }
    public void setCarrier(String carrier){
        this.carrier = carrier;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void printCellPhoneIfo(){
        System.out.printf("What is your serial number: %s \n", this.serialNumber);

        System.out.printf("What model is the phone? %s \n", this.Model);

        System.out.printf("who is the carrier? %s \n", this.carrier);

        System.out.printf("What is the phone number: %s \n",this.phoneNumber);

        System.out.printf("Who is the owner of the phone: %s \n",this.owner);
    }
}


