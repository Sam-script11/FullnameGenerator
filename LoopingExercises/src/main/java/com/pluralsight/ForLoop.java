package com.pluralsight;

public class ForLoop {
    public static void main(String[] args) throws InterruptedException {

        for(  int count = 10; count >=1; count--){
            Thread.sleep(1000);
            System.out.println(count);
            if( count ==1){
                System.out.println("KABAM");
            }
        }
    }
}
