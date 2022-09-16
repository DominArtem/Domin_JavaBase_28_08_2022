package com.hillel.domin.homeworks.homework5;

import java.util.Scanner;

public class Homework5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("enter team 1 name:");
        String team1 = scanner.nextLine();
        System.out.println(team1);

        System.out.println("frags gamer 1");
        int gam1Team1 = 0;
        if (scanner.hasNextInt()) {
            gam1Team1 = scanner.nextInt();
            System.out.println(gam1Team1);
        } else {
            System.out.println("wrong data");
            System.exit(0);
        }

        System.out.println("frags gamer 2");
        int gam2Team1 = 0;
        if (scanner.hasNextInt()) {
           gam2Team1 = scanner.nextInt();
            System.out.println(gam2Team1);
        } else {
            System.out.println("wrong data");
            System.exit(0);
        }

        System.out.println("frags gamer 3");
        int gam3Team1 = 0;
        if (scanner.hasNextInt()) {
            gam3Team1 = scanner.nextInt();
            System.out.println(gam3Team1);
        } else {
            System.out.println("wrong data");
            System.exit(0);
        }

        System.out.println("frags gamer 4");
        int gam4Team1 = 0;
        if (scanner.hasNextInt()) {
            gam4Team1 = scanner.nextInt();
            System.out.println(gam4Team1);
        } else {
            System.out.println("wrong data");
            System.exit(0);
        }

        System.out.println("frags gamer 5");
        int gam5Team1 = 0;
        if (scanner.hasNextInt()) {
          gam5Team1 = scanner.nextInt();
            System.out.println(gam5Team1);
        } else {
            System.out.println("wrong data");
            System.exit(0);

        }
        System.out.println("Suma Frags team 1");
        int sumFragT1 = 0;
        System.out.println(sumFragT1=(gam5Team1 + gam4Team1 + gam3Team1 + gam2Team1 + gam1Team1)/5);

        scanner.nextLine();









        }


//        System.out.println("enter team 2 name:");
//        String team2 = scanner.nextLine();
//        System.out.println(team2);


    }






