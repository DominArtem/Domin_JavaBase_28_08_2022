package com.hillel.domin.homeworks.homework7;

import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Homework7 {
    public static void main(String[] args) {



        int counter = 0;
        for (int i = 1; counter < 100; i++) {
            if ((i == 4) || (i == 9) || (i / 10 == 4) || (i / 10 == 9) || (i % 10 == 4) || (i % 10 == 9) || (i / 10 % 10 == 4) || (i / 10 % 10 == 9)) {
                continue;
            }
            System.out.println("Shuttle number:" + i);
            counter++;
        }
            System.out.println("Number of shuttles: " + counter);


        }

    }













