package com.hillel.domin.homeworks.homework6;

import java.util.Scanner;

public class Homework6 {

    public static void main(String[] args) {

//        Зробити гру, в якій потрібно відгадати ціле число, яке "загадав" комп'ютер у діапазоні від 0 до 10
//        Користувач повинен мати можливість вгадувати в кілька спроб (мінімум 3).

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any integer from 0 to 10");

        int num = 10;
        int no = ((int) (Math.random() * num));
        int g = 0;

        for (int i = 3 ; i > 0 ; i--) {

//
        if (scanner.hasNextInt()) {
        } else {
        System.out.println("Wrong data");
            System.exit(0);
        }



        int user = scanner.nextInt();


//            System.out.println(no);

                if (user == no) {
                    System.out.println("Exelent");
                    break;

                } else if (user > no) {
                    System.out.println("The number is greater");
                    scanner.nextLine();
//            break;

                } else {
                    System.out.println("Number less");
                    scanner.nextLine();
//            break;


                }


            }
        }
    }




















