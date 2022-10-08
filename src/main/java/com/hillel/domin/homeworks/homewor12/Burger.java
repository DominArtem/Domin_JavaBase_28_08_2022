package com.hillel.domin.homeworks.homewor12;

public class Burger {

    String meat;
    String roll;
    String cheese;
    String greens;
    String mayonnaise;
    String doubleMeat;

    @Override
    public String toString() {
        return "Burger{" +
                "meat='" + meat + '\'' +
                ", roll='" + roll + '\'' +
                ", cheese='" + cheese + '\'' +
                ", greens='" + greens + '\'' +
                ", mayonnaise='" + mayonnaise + '\'' +
                ", doubleMeat='" + doubleMeat + '\'' +
                '}';
    }

    public Burger(String meat, String roll, String cheese, String greens, String mayonnaise) {
        this.meat = meat;
        this.roll = roll;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;



    }
//
    public Burger(String meat, String roll, String cheese, String greens) {
        this.meat = meat;
        this.roll = roll;
        this.cheese = cheese;
        this.greens = greens;
    }

    public Burger(String meat, String roll, String cheese, String greens, String mayonnaise, String doubleMeat) {
        this.meat = meat;
        this.roll = roll;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;
        this.doubleMeat = doubleMeat;
    }

    //
//    public Burger(String roll, String cheese, String greens, String mayonnaise, String secondMeat) {
//
//        this.roll = roll;
//        this.cheese = cheese;
//        this.greens = greens;
//        this.mayonnaise = mayonnaise;
//        this.secondMeat = secondMeat;
//    }
}
