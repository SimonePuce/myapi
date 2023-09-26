package it.its.myapi.di;

import it.its.myapi.ibands.IBand;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Oasis implements IBand {

    @Override
    public void sing(){
        System.out.println("BUT AFTER ALL YOU'RE MY WONDERWALL");
    }
}
