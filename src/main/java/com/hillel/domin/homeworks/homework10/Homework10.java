package com.hillel.domin.homeworks.homework10;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Homework10 {
    public static void main(String[] args) {




        int[][] array = new int[3][3];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 11);
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();

        }
//        System.out.println(array [0][1]);



        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array[i].length; j++) {
                int temp = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = temp;

            }
            System.out.println();

        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();


        }
    }
}
