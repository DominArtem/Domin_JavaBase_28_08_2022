package com.hillel.domin.homeworks.homework6;

import java.util.Scanner;

public class Homework6 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any integer from 0 to 10");

        int num = 10;
        int no = ((int) (Math.random() * num));


        for (int i = 3 ; i > 0 ; i--) {
            if (scanner.hasNextInt()) {
            } else {
             System.out.println("Wrong data");
             System.exit(0);
        }



        int user = scanner.nextInt();



                if (user == no) {
                    System.out.println("Exelent");
                    break;

                } else if (user > no) {
                    System.out.println("The number is greater");
                    scanner.nextLine();

                } else {
                    System.out.println("Number less");
                    scanner.nextLine();



                }


            }
        }
    }




















