package com.hillel.domin.homeworks.homewor12;

public class Main {

    public static void main(String[] args) {


        Burger burgerMix = new Burger("meat", "roll", "cheese", "greens", "mayonnaise");

        System.out.println("Burger mix: " + burgerMix);

        System.out.println();

        Burger dietBurger = new Burger("meat", "roll", "cheese", "greeens");

        System.out.println("Diet Burger: " + dietBurger );

        System.out.println();

        Burger burgerDobleMeat = new Burger("meat", "roll", "cheese", "greens", "mayonaise", "Dounle Meat");

        System.out.println("Burger double meat: " + burgerDobleMeat);

        System.out.println();
        System.out.println();

        BurgerMain meatBurger = new BurgerMain("meat", "roll");
        System.out.println("Meat Burger: " + meatBurger);

        System.out.println();

        BurgerMain vegan = new BurgerMain("roll", "cheese", "cabbage", "sause");
        System.out.println("Burger vegan: " + vegan );

        System.out.println();

        BurgerMain superBurger = new BurgerMain("meat", "roll", "cheese", "cabbage", "sause");
        System.out.println("Super Burger: " + superBurger);







    }
}
