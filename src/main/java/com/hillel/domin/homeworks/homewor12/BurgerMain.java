package com.hillel.domin.homeworks.homewor12;

public class BurgerMain {
    public static void main(String[] args) {


    Burger burgerMix = new Burger("meat", "roll", "cheese", "greens", "mayonnaise");


//        System.out.print("Burger mix: " + burgerMix.meat + "," + burgerMix.roll + ","  + burgerMix.cheese + ","  + burgerMix.greens + ","  + burgerMix.mayonnaise + ".");

        System.out.println();

    Burger dietBurger = new Burger("meat", "roll", "cheese", "greeens");

        System.out.println();

    Burger burgerDobleMeat = new Burger("meat", "roll", "cheese", "greens", "mayonaise", "Dounle Meat");


}

}