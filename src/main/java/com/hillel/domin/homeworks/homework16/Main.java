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

        String b = "You have more drink?";
        String y = "Yes";
        String n = "No";


        while (true) {
            DrinksMachine drinksMachine = null;
            System.out.println("Choose a drink:" + Arrays.toString(drinksMachines));


            while (true) {
                String userValue = scanner.nextLine().toUpperCase();
                if (userValue.equals("yes")){
                    continue;
                }
                if (userValue.equals("no")) {
                    System.exit(0);
                }
                for (DrinksMachine drinks : drinksMachines) {
                    if (userValue.equals(drinks.toString())) {
//                    System.out.println("eeeee");
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
                        System.out.println("Your drink is being prepared: " + DrinksMachine.TEA + " for payment " + tea.TEA + "$");
                        System.out.println(b);
//
                        break;
                    }
                    case COFFEE: {
                        System.out.println("Your drink is being prepared: " + DrinksMachine.COFFEE + " for payment " + coffee.COFFEE + "$");
//                        System.out.println(n);
                        break;
                    }
                    case LEMONADE: {
                        System.out.println("Your drink is being prepared: " + DrinksMachine.LEMONADE + " for payment " + lemonade.LEMONADE + "$");
//                        System.out.println(n);
                        break;
                    }
                    case MOJITO: {
                        System.out.println("Your drink is being prepared: " + DrinksMachine.MOJITO + " for payment " + mojito.MOJITO + "$");
//                        System.out.println(n);
                        break;
                    }
                    case MINERAL: {
                        System.out.println("Your drink is being prepared: " + DrinksMachine.MINERAL + " for payment " + mineral.MINERAL + "$");
//                        System.out.println(n);
                        break;
                    }
                    case COCACOLA: {
                        System.out.println("Your drink is being prepared: " + DrinksMachine.COCACOLA + " for payment " + cola.COCACOLA + "$");
//                        System.out.println(n);
                        break;
                    }
                }
//            String d = String.valueOf(scanner.nextLine());
//                        if (Objects.equals(d, y)){
//                            continue;
//                        }
//                        if (Objects.equals(d, n)) {
//                            System.exit(0);
//                        }
            }
//               System.out.println(b);
            }



        }






