package com.hillel.domin.homeworks.homework14;

import com.hillel.domin.homeworks.homework14.heirs.ClassicMusic;
import com.hillel.domin.homeworks.homework14.heirs.MusicStyles;
import com.hillel.domin.homeworks.homework14.heirs.PopMusic;
import com.hillel.domin.homeworks.homework14.heirs.RockMusic;

public abstract class Main {

    public static void main(String[] args) {

        MusicStyles[] musicStyles1 = {
                new PopMusic("Michael Jacson"),
                new PopMusic("ABBA"),
                new PopMusic("Tom Jones"),

        };


        MusicStyles[] musicStyles2 = {
                new RockMusic("Bon Jovi"),
                new RockMusic("Led Zeppelin"),
                new RockMusic("ACDC"),
        };

        MusicStyles[] musicStyles3 = {
                new ClassicMusic("Ludwig Van Beethoven"),
                new ClassicMusic("Yann Tiersen"),
                new ClassicMusic("Antonio Vivaldi"),
        };

        for (MusicStyles musicPopMusic : musicStyles1) {
            musicPopMusic.playMusic();
        }

        for (MusicStyles musicRockMusic : musicStyles2) {
            musicRockMusic.playMusic();
        }
        for (MusicStyles musicClassicMusic : musicStyles3) {
            musicClassicMusic.playMusic();
        }


    }
}




