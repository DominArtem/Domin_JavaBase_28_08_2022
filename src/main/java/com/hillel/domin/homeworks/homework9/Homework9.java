package com.hillel.domin.homeworks.homework9;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.SortedMap;

public class Homework9 {

    public static void main(String[] args) {

        int[] first = new int[7];
        int[] second = new int[7];

        for (int i = 0; i < first.length; i++) {
            first[i] = ((int) (Math.random() * 10));

            System.out.print(first[i] + " ");

        }
        System.out.println();

        for (int j = 0; j < second.length; j++) {
            second[j] = ((int) (Math.random() * 10));

            System.out.print(second[j] + " ");
        }
        System.out.println();


        Arrays.sort(first);
        System.out.println(Arrays.toString(first));

        Arrays.sort(second);
        System.out.println(Arrays.toString(second));

        int a = 0;

        for (int i = 0; i < first.length; i++) {
            if (first[i] == second[i]) {
                a = first [i];
                a++;
                System.out.println("Elements " + (i + 1) + " converged");
                }
            if (a == 0){
                System.out.println("There is no match");

            }
            break;

        }System.out.println("Number of number matches " + a);

    }
    }
















