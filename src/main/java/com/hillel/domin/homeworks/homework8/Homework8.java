package com.hillel.domin.homeworks.homework8;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Homework8 {
    public static void main(String[] args) {


//        * Є дві команди регбі з 25 гравців різного віку у кожній.
//        * Вік беремо випадковим чином в діапазоні від 18 до 40.
//        * Виведіть у двох рядках вік гравців кожної команди.
//        * Порахуйте середній вік гравців кожної команди та виведіть на екран.




        int [] team1 = new int[25] ;
        int [] team2 = new int[25] ;
        int sumTeam1 = 0;
        int sumTeam2 = 0;


//  Возраст игроков 1 команды

        for (int i = 0; i < team1.length ; i++ ){
            team1 [i] = (int)((Math.random() * 22) + 18 + 1);
        }System.out.println(Arrays.toString(team1));

        System.out.println();

//        Возраст игроков 2 команды

        for (int i = 0; i < team2.length ; i++ ){
            team2 [i] = (int)((Math.random() * 22) + 18 + 1);
//            System.out.println("Number team 2 plauer:" + (i + 1) + " " + "Age plauer:" + team2[i]);
        }System.out.println(Arrays.toString(team2));

        System.out.println();

//  Просчет среднего возраста команды 1

        for (int i = 0 ; i < team1.length; i++) {
            sumTeam1 = sumTeam1 + team1[i];
        }
//            System.out.println("Number team 1 plauer:" + (i + 1) + " " + "Age plauer:" + team1[i]);

//        System.out.println(sumTeam1);
        double sumAgeTeam1 = (double) sumTeam1/ team1.length;
        System.out.println("Team average age one:" + " " + sumAgeTeam1);

        System.out.println();

//  Просчет среднего возраста команды 2


        for (int i = 0 ; i < team2.length; i++) {
            sumTeam2 = sumTeam2 + team2[i];
        }
//            System.out.println("Number team 1 plauer:" + (i + 1) + " " + "Age plauer:" + team1[i]);

//        System.out.println(sumTeam1);
        double sumAgeTeam2 = (double) sumTeam2/ team2.length;
        System.out.println("Team average age two:" +  " " + sumAgeTeam2);


    }
}
