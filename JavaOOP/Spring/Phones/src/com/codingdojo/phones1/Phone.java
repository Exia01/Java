package com.codingdojo.phones1;

import java.util.Random;

public abstract class Phone implements PhoneFunctions {
    private String owner;
    private String OS;
    private String carrier;
    private String phoneNumber;
    private int batteryPercentage = 100;
    private static int phoneCount = 0;
    private double price;
    private Boolean locked = true;

    // Random number generator
    private String generateAccountNumber() {
        int num1, num2, num3; // 3 numbers in area code
        int set2, set3; // sequence 2 and 3 of the phone number

        Random generator = new Random();
        num1 = generator.nextInt(7) + 1;
        num2 = generator.nextInt(8);
        num3 = generator.nextInt(8);
        set2 = generator.nextInt(643) + 100;
        set3 = generator.nextInt(8999) + 1000;

        String newNum = "(" + num1 + "" + num2 + "" + num3 + ")" + "-" + set2 + "-" + set3;

        System.out.println(newNum);
        return newNum;

    }

    public Phone(String owner, String carrier) {
        this.phoneNumber = this.generateAccountNumber();
        this.owner = owner;
        this.carrier = carrier;
        phoneCount += 1;
        System.out.println(
                "We have generated a phone number automatically for you. The new phone number is " + this.phoneNumber);
    }

    public Phone(String ownerParam, String carrierParam, double priceParam) {
        this.phoneNumber = this.generateAccountNumber();
        this.owner = ownerParam;
        this.carrier = carrierParam;
        this.price = priceParam;
        phoneCount += 1;
        System.out.println(
                "We have generated a phone number automatically for you. The new phone number is " + this.phoneNumber);
    }

    public void ring() {
        System.out.println("ring...hello.....? ring ring....eh eh hello?");
    };

    // setters

    public void setUnlock(Boolean lock) {
        this.locked = false;
    }

    public void setlock(Boolean lock) {
        this.locked = true;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setBatteryPercent(int percent) {
        this.batteryPercentage = percent;
    }

    public void setCarrier(String carrierParams) {
        this.carrier = carrierParams;
    }

    public void setOS(String os) {
        this.OS = os;
    }

    public void setOwner(String ownerParams) {
        this.owner = ownerParams;
    }

    // getters

    Boolean getLockStatus() {
        return this.locked;
    }

    public double getPrice() {
        return price;
    }

    public int getBatteryPercent() {
    	System.out.println("The current percentage is: " + batteryPercentage);
        return batteryPercentage;
    }

    public String getCarrier() {
        return this.carrier;
    }

    public String getOS() {
        return this.OS;
    }

    public String getOwner() {
    	System.out.println("The owner of this phone is " + this.owner);
        return this.owner;
    }

    public static int getPhoneCount() {
        return phoneCount;
    }
}
