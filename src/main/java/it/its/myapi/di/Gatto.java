package it.its.myapi.di;

import it.its.myapi.ibands.Animale;

public class Gatto implements Animale {
    @Override
    public void verso() {
        System.out.println("Meow :3");
    }
}
