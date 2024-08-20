package org.example.services;

import org.example.entities.DiaTrabalhado;
import org.example.entities.Trabalhador;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CalculosTest {


    @Test
    @DisplayName("colocar descrição")
    void calcularHoras() {

        double totalDeHoras = 10;

        String nome = "kelve";
        double taxa = 0.5;

        double horasTrabalhadas = 20.0;
        DiaTrabalhado listaHoras = new DiaTrabalhado(horasTrabalhadas);
        ArrayList<DiaTrabalhado> diastrabalhados= new ArrayList<>();
        diastrabalhados.add(listaHoras);


        Trabalhador trabalhador = new Trabalhador(taxa,nome,diastrabalhados);
        Calculos calculos = new Calculos(trabalhador);

        double resultado = calculos.calcularHoras(trabalhador.getDiasTrabalhados(),trabalhador.getTaxa());
       Assertions.assertEquals(resultado,resultado);
    }

    @Test
    void calcularPaganento() {
    }
}
