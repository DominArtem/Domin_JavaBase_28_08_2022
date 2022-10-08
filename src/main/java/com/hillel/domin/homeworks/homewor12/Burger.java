package com.hillel.domin.homeworks.homewor12;

public class Burger {

    String meat;
    String roll;
    String cheese;
    String greens;
    String mayonnaise;
    String doubleMeat;


    public Burger(String meat, String roll, String cheese, String greens, String mayonnaise) {
        this.meat = meat;
        this.roll = roll;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;

        System.out.println("Burger mix: " + meat + "," + roll + "," + cheese + "," + greens + "," +  mayonnaise + ".");

    }


    public Burger(String meat, String roll, String cheese, String greens) {
        this.meat = meat;
        this.roll = roll;
        this.cheese = cheese;
        this.greens = greens;

        System.out.println("Diet Burger: " + meat + "," + roll + "," + cheese + "," + greens+ ".");

    }

    public Burger(String meat, String roll, String cheese, String greens, String mayonnaise, String doubleMeat) {
        this.meat = meat;
        this.roll = roll;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;
        this.doubleMeat = doubleMeat;

        System.out.println("Burger double meat: " + doubleMeat + "," + roll + "," + cheese + "," + greens + "," +  mayonnaise+ ".");
    }

}
