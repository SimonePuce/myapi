package it.its.myapi.di;

import it.its.myapi.ibands.Animale;

public class Cane implements Animale {
    @Override
    public void verso() {
        System.out.println("Bau :D");
    }
}
