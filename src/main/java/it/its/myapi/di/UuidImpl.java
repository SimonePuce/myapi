package it.its.myapi.di;

import it.its.myapi.ibands.Uuid;
import org.springframework.stereotype.Component;

import java.util.UUID;


public class UuidImpl implements Uuid {
    @Override
    public void creaUuid() {
        UUID uuid = UUID.randomUUID();
        String uuidAsString = uuid.toString();
        System.out.println(uuidAsString);
    }
}
