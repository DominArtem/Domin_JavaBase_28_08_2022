package com.hillel.domin.homeworks.homework14.heirs;

public class ClassicMusic extends MusicStyles {

    String name;

    public ClassicMusic(String name) {
        this.name = name;
    }

    @Override
    public void playMusic() {
        System.out.println("Play to Classic Music :" + name);
    }
}
