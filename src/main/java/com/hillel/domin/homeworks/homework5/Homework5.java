package com.hillel.domin.homeworks.homework5;

import java.util.Scanner;

public class Homework5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int gam1Team1 = 0;
        int gam2Team1 = 0;
        int gam3Team1 = 0;
        int gam4Team1 = 0;
        int gam5Team1 = 0;

        System.out.println("enter team 1 name:");
        String team1 = scanner.nextLine();
//        System.out.println(team1);

        System.out.println("frags gamer 1");

        if (scanner.hasNextInt()) {
            gam1Team1 = scanner.nextInt();
//            System.out.println(gam1Team1);
        } else {
            System.out.println("wrong data");
            System.exit(0);
        }

        System.out.println("frags gamer 2");

        if (scanner.hasNextInt()) {
            gam2Team1 = scanner.nextInt();
//            System.out.println(gam2Team1);
        } else {
            System.out.println("wrong data");
            System.exit(0);
        }

        System.out.println("frags gamer 3");

        if (scanner.hasNextInt()) {
            gam3Team1 = scanner.nextInt();
//            System.out.println(gam3Team1);
        } else {
            System.out.println("wrong data");
            System.exit(0);
        }

        System.out.println("frags gamer 4");

        if (scanner.hasNextInt()) {
            gam4Team1 = scanner.nextInt();
//            System.out.println(gam4Team1);
        } else {
            System.out.println("wrong data");
            System.exit(0);
        }

        System.out.println("frags gamer 5");

        if (scanner.hasNextInt()) {
            gam5Team1 = scanner.nextInt();
//            System.out.println(gam5Team1);
        } else {
            System.out.println("wrong data");
            System.exit(0);

        }
//        System.out.println("Suma Frags team 1");
        double sumFragT1 = (double) (gam5Team1 + gam4Team1 + gam3Team1 + gam2Team1 + gam1Team1) / 5;
//        System.out.println(sumFragT1);

        scanner.nextLine();

        int gam1Team2 = 0;
        int gam2Team2 = 0;
        int gam3Team2 = 0;
        int gam4Team2 = 0;
        int gam5Team2 = 0;

        System.out.println("enter team 2 name:");
        String team2 = scanner.nextLine();
//        System.out.println(team2);

        System.out.println("frags gamer 1");

        if (scanner.hasNextInt()) {
            gam1Team2 = scanner.nextInt();
//            System.out.println(gam1Team2);
        } else {
            System.out.println("wrong data");
            System.exit(0);
        }

        System.out.println("frags gamer 2");

        if (scanner.hasNextInt()) {
            gam2Team2 = scanner.nextInt();
//            System.out.println(gam2Team2);
        } else {
            System.out.println("wrong data");
            System.exit(0);
        }

        System.out.println("frags gamer 3");

        if (scanner.hasNextInt()) {
            gam3Team2 = scanner.nextInt();
//            System.out.println(gam3Team2);
        } else {
            System.out.println("wrong data");
            System.exit(0);
        }

        System.out.println("frags gamer 4");

        if (scanner.hasNextInt()) {
            gam4Team2 = scanner.nextInt();
//            System.out.println(gam4Team2);
        } else {
            System.out.println("wrong data");
            System.exit(0);
        }

        System.out.println("frags gamer 5");

        if (scanner.hasNextInt()) {
            gam5Team2 = scanner.nextInt();
//            System.out.println(gam5Team2);
        } else {
            System.out.println("wrong data");
            System.exit(0);

        }
//        System.out.println("Suma Frags team 2");
        double sumFragT2 = (double) (gam5Team2 + gam4Team2 + gam3Team2 + gam2Team2 + gam1Team2) / 5;
//        System.out.println(sumFragT2);

        scanner.nextLine();

        if (sumFragT1 > sumFragT2) {
            System.out.println("Перемогла команда: " + team1 + "\n" + "набрала: " + (sumFragT1 * 5) + " очків");
        }
        if (sumFragT1 < sumFragT2) {
            System.out.println("Перемогла команда: " + team2 + "\n" + "набрала: " + (sumFragT2 * 5) + " очків");
        }
        if (sumFragT1 == sumFragT2) {
            System.out.println("Dead heat");
        }

        scanner.close();

    }



    }






