package com.hillel.domin.homeworks.homework14.heirs;

public class RockMusic extends MusicStyles {

    String name;

    public RockMusic(String name) {
        this.name = name;
    }

    @Override
    public void playMusic() {
        System.out.println("Play to Rock Music :" + name);
    }
}
