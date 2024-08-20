package org.example.services;

import org.example.entities.DiaTrabalhado;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;



class CalculosTest {


    @Test
    @DisplayName("calcula o total de horas trabalhadas")
    void calcularHoras() {

        double resultadoFinal = 60;
        double totalDeHoras =0.0;

        DiaTrabalhado hora1 = new DiaTrabalhado(20.0);
        DiaTrabalhado hora2 = new DiaTrabalhado(20.0);
        DiaTrabalhado hora3 = new DiaTrabalhado(20.0);

        ArrayList<DiaTrabalhado> diastrabalhados= new ArrayList<>();
        diastrabalhados.add(hora1);
        diastrabalhados.add(hora2);
        diastrabalhados.add(hora3);

        for(DiaTrabalhado dia: diastrabalhados){
            totalDeHoras+=dia.getHorasTrabalhando();
        }
       Assertions.assertEquals(totalDeHoras,resultadoFinal);
    }

    @Test
    @DisplayName("calcula o total de pagamentos")
    void calcularPaganento() {

    }
}
