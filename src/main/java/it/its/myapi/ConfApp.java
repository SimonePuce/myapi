package it.its.myapi;

import it.its.myapi.di.Cane;
import it.its.myapi.di.Gatto;
import it.its.myapi.di.UuidImpl;
import it.its.myapi.di.UuidNonCasuale;
import it.its.myapi.ibands.Animale;
import it.its.myapi.ibands.Uuid;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfApp {

    @Bean
    public Animale gatto(){
        return new Gatto();
    }

    @Bean
    public Animale cane(
    ){
        return new Cane();
    }

    @Bean
    public Uuid uuidImpl(){
        return new UuidImpl();
    }

    @Bean
    public Uuid uuidNonCasuale(){
        return new UuidNonCasuale();
    }
}
