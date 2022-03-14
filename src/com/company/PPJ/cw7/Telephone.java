package com.company.PPJ.cw7;

public class Telephone {

    String model;
    double resolution;
    String number;

    public Telephone(String model, double resolution, String number) {
        this.model = model;
        this.resolution = resolution;
        this.number = number;
    }

    void sendSMS(String number, String text){

        System.out.println(" Sending message"+text+"to number"+number);


    }


}
