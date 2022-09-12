package com.hillel.domin.homeworks.homework4;

public class homework4 {
    public static void main(String[] args) {


        int atWarLi = 13;
        int atArLi = 24;
        int atHorLi = 46;

        int sumLi = 860;

        int sumAtLi = (atWarLi + atArLi + atHorLi) * sumLi;
        System.out.println(sumAtLi);

        final double coef = 1.5;

        double sumMin = coef * 860;

        double atWarMin = 9;
        double atArMin = 35;
        double atHorMin = 12;

        double totAtMin = (atWarMin + atArMin + atHorMin) * sumMin;
        System.out.println(totAtMin);

        double totAttLiMIn =  totAtMin + sumAtLi ;
        System.out.println(totAtMin + sumAtLi);
    }
}
