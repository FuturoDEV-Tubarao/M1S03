package tech.devinhouse.aula04.interfaces;

import java.time.LocalTime;

public interface TrabalhadorDefault {

    void baterPontoNormal();
    
    default void baterPonto(LocalTime horario) {
        System.out.println("bateu ponto de qualquer jeito");
    }

}
