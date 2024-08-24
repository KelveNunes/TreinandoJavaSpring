package org.contador.services;

import org.contador.model.entities.DiaTrabalhado;
import org.contador.model.entities.Trabalhador;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;



class CalculosTest {
    double totalDeHoras =0.0;
    double totalPagamento = 0.0;

    ArrayList<DiaTrabalhado> diastrabalhados= new ArrayList<>();
    Trabalhador trabalhador = new Trabalhador("kelve", 2, diastrabalhados);

    @Test
    @DisplayName("calcula o total de horas trabalhadas")
    void calcularHoras() {

        DiaTrabalhado hora1 = new DiaTrabalhado(20.0);
        DiaTrabalhado hora2 = new DiaTrabalhado(20.0);
        DiaTrabalhado hora3 = new DiaTrabalhado(20.0);

        diastrabalhados.add(hora1);
        diastrabalhados.add(hora2);
        diastrabalhados.add(hora3);

        for(DiaTrabalhado dia : diastrabalhados ){
            totalDeHoras+= dia.getHorasTrabalhando();
        }
        double resultadoHoras = Calculos.calcularHoras(trabalhador.getDiasTrabalhados());

       Assertions.assertEquals(totalDeHoras, resultadoHoras);
    }

    @Test
    @DisplayName("calcula o total de pagamentos")
    void calcularPaganento() {

        DiaTrabalhado hora1 = new DiaTrabalhado(20.0);
        DiaTrabalhado hora2 = new DiaTrabalhado(20.0);
        DiaTrabalhado hora3 = new DiaTrabalhado(20.0);

        diastrabalhados.add(hora1);
        diastrabalhados.add(hora2);
        diastrabalhados.add(hora3);
        for(DiaTrabalhado dia : trabalhador.getDiasTrabalhados() ){
            totalDeHoras+= dia.getHorasTrabalhando();
        }
        totalPagamento = trabalhador.getTaxa() * totalDeHoras;
        double resultadoPagamento = Calculos.calcularPaganento(trabalhador);

        Assertions.assertEquals(totalPagamento,resultadoPagamento);


    }
}
