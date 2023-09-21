package it.its.myapi.di;

import it.its.myapi.ibands.IBand;
import org.springframework.stereotype.Component;

@Component
public class Clash implements IBand {

    public void sing(){
        System.out.println("London calling");
    }
}
