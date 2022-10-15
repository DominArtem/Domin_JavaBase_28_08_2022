package com.hillel.domin.homeworks.homework13;

import java.util.SortedMap;

public class Main {

    public static void main(String[] args) {

        User user1 = new User("Tola", 1, 5, 1998 , "tola@gmail.com", "0965554122", "Lox", 74, "120/80", 4587 );

        System.out.println(user1.printAccountInfo("Tola", 1, 5, 1998,  "tola@gmail.com", "0965554122", "Lox", 74,"120/80",4587 ));

        System.out.println("Age user: " + user1.getAge());

        System.out.println();

        User user2 = new User ("Alex", 14, 7 , 1991 , "Alex@gmail.com", "0637748951", "Jorge", 81,"120/80",8841);


        System.out.println(user2.printAccountInfo("Alex", 14, 7, 1991, "Alex@gmail.com", "0637748951", "Jorge", 81, "120/80", 8841));
        System.out.println("Age user: " + user2.getAge());

        System.out.println();

        User user3 = new User("Nikita", 29, 3, 1995, "Nikita@gmail.com", "0983214598", "Skiba", 91, "120/80", 11253 );
        System.out.println(user3.printAccountInfo("Nikita", 29,3,1995, "Nikita@gmail.com", "0983214598" , "Skiba", 91, "120/80", 11253 ));
//        System.out.println("Age user: " + user3.getAge());

        System.out.println();
        System.out.println("Before");
        System.out.println();

        System.out.println(user1.printAccountInfo("Tola", 1, 5, 1998,  "tola@gmail.com", "0965554122", "Lox", 77,"120/80",8989 ));

        System.out.println();

        System.out.println(user3.printAccountInfo("Nikita", 29,3,1995, "Nikita@gmail.com", "0983214598" , "Skiba", 101, "120/80", 7421 ));







    }


}
