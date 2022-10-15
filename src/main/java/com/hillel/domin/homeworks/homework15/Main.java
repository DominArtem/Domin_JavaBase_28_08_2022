package com.hillel.domin.homeworks.homework15;

public class Main {
    public static void main(String[] args) {

        Smartphones androids = new Androids();
        androids.call();
        androids.sms();
        androids.internet();


        System.out.println();

        Smartphones iPhones = new IPhones();
        iPhones.internet();
        iPhones.sms();
        iPhones.call();

        System.out.println();

        LinuxOS linux = new Androids();
        linux.getOS();

        System.out.println();

        IOS iOS = new IPhones();
        iOS.getIOS();








    }
}
