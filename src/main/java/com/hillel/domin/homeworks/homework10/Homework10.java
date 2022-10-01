package com.hillel.domin.homeworks.homework10;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Homework10 {
    public static void main(String[] args) {


        int n = 0;
        int m = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of lines");

        if (scanner.hasNextInt()) {
            n = scanner.nextInt();
        } else {
            System.out.println("Wrong data");
            System.exit(0);
        }
        scanner.nextLine();

        System.out.println("Enter the number of columns");

        if (scanner.hasNextInt()) {
         m = scanner.nextInt();
        } else {
            System.out.println("Wrong data");
            System.exit(0);
        }
        scanner.nextLine();
        scanner.close();


        System.out.println();

        int[][] array = new int[n][m];

        System.out.println("Before");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array [i][j] = (int)(Math.random() * 10);
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("After");

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array[i].length; j++) {
                int temp = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = temp;
            }

        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
