package com.hillel.domin.homeworks.homewor12;

public class BurgerMain{

    String meat;
    String roll;
    String cheese;
    String cabbage;
    String sauce;


    @Override
    public String toString() {
        return "BurgerMain{" +
                "meat='" + meat + '\'' +
                ", roll='" + roll + '\'' +
                ", cheese='" + cheese + '\'' +
                ", cabbage='" + cabbage + '\'' +
                ", sauce='" + sauce + '\'' +
                '}';
    }

    public BurgerMain(String meat, String roll) {
        this.meat = meat;
        this.roll = roll;
    }

    public BurgerMain(String roll, String cheese, String cabbage, String sauce) {
        this.roll = roll;
        this.cheese = cheese;
        this.cabbage = cabbage;
        this.sauce = sauce;
    }

    public BurgerMain(String meat, String roll, String cheese, String cabbage, String sauce) {
        this.meat = meat;
        this.roll = roll;
        this.cheese = cheese;
        this.cabbage = cabbage;
        this.sauce = sauce;
    }
}
