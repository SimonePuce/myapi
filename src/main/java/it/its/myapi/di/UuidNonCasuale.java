package it.its.myapi.di;

import it.its.myapi.ibands.Uuid;

public class UuidNonCasuale implements Uuid {
    @Override
    public void creaUuid() {
        String uuidFisso = "bbcc4621-d88f-4a94-ae2f-b38072bf5087";
        System.out.println(uuidFisso);
    }
}
