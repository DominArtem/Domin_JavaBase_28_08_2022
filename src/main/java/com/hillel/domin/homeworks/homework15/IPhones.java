package com.hillel.domin.homeworks.homework15;

public class IPhones implements Smartphones, IOS {
    @Override
    public void call() {
        System.out.println("Smartphones call...");
    }

    @Override
    public void sms() {
        System.out.println("Smartphone sends a message... ");
    }

    @Override
    public void internet() {
        System.out.println("Smartphone searches on the internet...");
    }

    @Override
    public void getIOS() {
        System.out.println("Work to iOS");

    }
}
