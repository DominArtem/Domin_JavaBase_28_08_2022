package com.hillel.domin.homeworks.homework14.heirs;

public class PopMusic extends MusicStyles {

    String name;

    public PopMusic(String name) {
        this.name = name;
    }

    @Override
    public void playMusic() {
        System.out.println("Play to Pop Music :" + name);
    }
}
