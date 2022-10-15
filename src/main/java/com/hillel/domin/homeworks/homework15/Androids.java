package com.hillel.domin.homeworks.homework15;

public class Androids implements Smartphones, LinuxOS {
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
    public void getOS() {
        System.out.println("Work to Linux");

    }
}
