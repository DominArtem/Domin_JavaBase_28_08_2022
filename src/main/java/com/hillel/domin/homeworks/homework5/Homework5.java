package com.hillel.domin.homeworks.homework5;

import java.util.Scanner;

public class Homework5 {
    public static void main(String[] args) {
//
//        int gam1Team1 = 0;
//        int gam2Team1 = 0;
//        int gam3Team1 = 0;
//        int gam4Team1 = 0;
//        int gam5Team1 = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter team 1 name:");
        String team1 = scanner.nextLine();
        System.out.println(team1);

        System.out.println("frags gamer 1");
        if (scanner.hasNextInt()) {
            int gam1Team1 = scanner.nextInt();
            System.out.println(gam1Team1);
        } else {
            System.out.println("wrong data");
            System.exit(0);
        }

        System.out.println("frags gamer 2");
        if (scanner.hasNextInt()) {
            int gam2Team1 = scanner.nextInt();
            System.out.println(gam2Team1);
        } else {
            System.out.println("wrong data");
            System.exit(0);
        }

        System.out.println("frags gamer 3");
        if (scanner.hasNextInt()) {
            int gam3Team1 = scanner.nextInt();
            System.out.println(gam3Team1);
        } else {
            System.out.println("wrong data");
            System.exit(0);
        }

        System.out.println("frags gamer 4");
        if (scanner.hasNextInt()) {
            int gam4Team1 = scanner.nextInt();
            System.out.println(gam4Team1);
        } else {
            System.out.println("wrong data");
            System.exit(0);
        }

        System.out.println("frags gamer 5");
        if (scanner.hasNextInt()) {
            int gam5Team1 = scanner.nextInt();
            System.out.println(gam5Team1);
        } else {
            System.out.println("wrong data");
            System.exit(0);
        }
        int gam1Team1 = 0;
        int gam2Team1 = 0;
        int gam3Team1 = 0;
        int gam4Team1 = 0;
        int gam5Team1 = 0;

        double sumTeam1 = ((gam1Team1 + gam2Team1 + gam3Team1 + gam4Team1 + gam5Team1) / 5);
        System.out.println(sumTeam1);



        }


//        System.out.println("enter team 2 name:");
//        String team2 = scanner.nextLine();
//        System.out.println(team2);


    }






