package com.hillel.domin.homeworks.homework4;

public class homework4 {
    public static void main(String[] args) {

        int attackWarriorLi = 13;
        int attackArcherLi = 24;
        int attackHorsemanLi = 46;

        double attackWarriorMin = 9;
        double attackArcherMin = 35;
        double attackHorsemanMin = 12;

        int totalWarriorLi = 860;
        int totalArcherLi = 860;
        int totalHorsemanLi = 860;

        final double Coef = 1.5;

        double totalWarriorMin = totalWarriorLi * Coef;
        double totalArcherMin = totalArcherLi * Coef;
        double totalHorsemanMin = totalHorsemanLi * Coef;


        int totalAttackLi = attackWarriorLi * totalWarriorLi + attackArcherLi * totalArcherLi + attackHorsemanLi * totalHorsemanLi;

        System.out.println(totalAttackLi);



        double totalAttackMin = attackWarriorMin * totalWarriorMin + attackArcherMin * totalArcherMin + attackHorsemanMin * totalHorsemanMin;

        System.out.println(totalAttackMin);

        double totalAttackLiTotalAttackMIn = totalAttackLi + totalAttackMin;

        System.out.println(totalAttackLiTotalAttackMIn);
    }
}
