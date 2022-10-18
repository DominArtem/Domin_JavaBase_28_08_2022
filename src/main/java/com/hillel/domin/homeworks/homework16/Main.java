package com.hillel.domin.homeworks.homework16;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        DrinksMachine[] drinksMachines = DrinksMachine.values();

        Drinks tea = new Drinks();
        Drinks coffee = new Drinks();
        Drinks lemonade = new Drinks();
        Drinks mojito = new Drinks();
        Drinks mineral = new Drinks();
        Drinks cola = new Drinks();
        int counter = 0;
        int total = 0;
        String b = "You have more drink?";
        String y = "YES";

        while (true) {
            DrinksMachine drinksMachine = null;
            System.out.println("Choose a drink:" + Arrays.toString(drinksMachines));


            while (true) {
                String userValue = scanner.nextLine().toUpperCase();


                for (DrinksMachine drinks : drinksMachines) {
                    if (userValue.equals(drinks.toString())) {
                        drinksMachine = DrinksMachine.valueOf(userValue);
                    }
                }
                if (drinksMachine != null) {
                    break;
                } else {
                    System.out.println("Value is incorrect");
                }

            }


                switch (drinksMachine) {
                    case TEA: {
                        if (tea == null){
                            System.out.println("wrong data");
                            continue;
                        }
                        System.out.println("Your drink is being prepared: " + DrinksMachine.TEA + " for payment " + tea.TEA + "$");
                        System.out.println(b);
                        counter++;
                        total += tea.TEA;
                        break;
                    }
                    case COFFEE: {
                        if (tea == null){
                            System.out.println("wrong data");
                            continue;
                        }
                        System.out.println("Your drink is being prepared: " + DrinksMachine.COFFEE + " for payment " + coffee.COFFEE + "$");
                        System.out.println(b);
                        counter++;
                        total += coffee.COFFEE;
                        break;
                    }
                    case LEMONADE: {
                        if (tea == null){
                            System.out.println("wrong data");
                            continue;
                        }
                        System.out.println("Your drink is being prepared: " + DrinksMachine.LEMONADE + " for payment " + lemonade.LEMONADE + "$");
                        System.out.println(b);
                        counter++;
                        total += lemonade.LEMONADE;
                        break;
                    }
                    case MOJITO: {
                        if (tea == null){
                            System.out.println("wrong data");
                            continue;
                        }
                        System.out.println("Your drink is being prepared: " + DrinksMachine.MOJITO + " for payment " + mojito.MOJITO + "$");
                        System.out.println(b);
                        counter++;
                        total += mojito.MOJITO;
                        break;
                    }
                    case MINERAL: {
                        if (tea == null){
                            System.out.println("wrong data");
                            continue;
                        }
                        System.out.println("Your drink is being prepared: " + DrinksMachine.MINERAL + " for payment " + mineral.MINERAL + "$");
                        System.out.println(b);
                        counter++;
                        total += mineral.MINERAL;
                        break;
                    }
                    case COCACOLA: {
                        if (tea == null){
                            System.out.println("wrong data");
                            continue;
                        }
                        System.out.println("Your drink is being prepared: " + DrinksMachine.COCACOLA + " for payment " + cola.COCACOLA + "$");
                        System.out.println(b);
                        counter++;
                        total += cola.COCACOLA;
                        break;
                    }
                }

            String q = scanner.nextLine().toUpperCase();
            if (q.equals(y)){
                continue;
            } else if (q.equals("NO")) {
                System.out.println("Number of drink " + counter + "\n" + "Total price: " + total);
                System.exit(0);
            }else {
                System.exit(0);
            }

            }

            }

            }











