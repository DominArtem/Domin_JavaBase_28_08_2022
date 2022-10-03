package com.hillel.domin.homeworks.homework11;

import javax.swing.plaf.synth.SynthRadioButtonMenuItemUI;
import javax.xml.namespace.QName;

public class Person {

    public static void main(String[] args) {

        System.out.println(personinfo("Fill", "Richards", "NY", "05215545"));
        System.out.println(personinfo("John", "Piston", "LA", "0521554565"));
        System.out.println(personinfo("Artem", "Domin", "Dnipro", "010101010101"));

    }

    private static String personinfo(String name, String surname, String city, String phone){
        return "Call a person: " + name + " " + surname + " from the " + city + " by the number: " + phone ;
    }
}





