package com.hillel.domin.homeworks.homework5;

import java.util.Scanner;

public class Homework5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner( System.in);

        System.out.println("enter team 1 name:");
        String team1 = scanner.nextLine();
        System.out.println(team1);

        System.out.println("frags gamer 1");
        if (scanner.hasNextInt()) {
            int gam1Team1 = scanner.nextInt();
        } else {
            System.out.println("wrong data");
            System.exit(0);
        }

        System.out.println("frags gamer 2");
        if (scanner.hasNextInt()) {
            int gam2Team1 = scanner.nextInt();
        } else {
            System.out.println("wrong data");
            System.exit(0);
        }

        System.out.println("frags gamer 3");
        if (scanner.hasNextInt()) {
            int gam3Team1 = scanner.nextInt();
        } else {
            System.out.println("wrong data");
            System.exit(0);
        }

        System.out.println("frags gamer 4");
        if (scanner.hasNextInt()) {
            int gam4Team1 = scanner.nextInt();
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

    }






//        System.out.println("enter team 2 name:");
//        String team2 = scanner.nextLine();
//        System.out.println(team2);






    }


