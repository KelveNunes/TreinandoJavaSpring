package org.contador.services;

import org.contador.model.DiaTrabalhado;
import org.contador.model.Trabalhador;

import java.util.ArrayList;

public class Calculos {


    public Calculos(){}
    public Calculos(Trabalhador trabalhador) {}


    public static Double calcularHoras(ArrayList<DiaTrabalhado> diasTrabalhados) {
        double totalHoras = 0.0;
        for (DiaTrabalhado dia : diasTrabalhados){
            totalHoras+=dia.getHorasTrabalhando();
        }
        if (totalHoras <= 0){
            return 0.0;
        }
        else{
            return totalHoras;
        }

    }

    public static Double calcularPaganento(Trabalhador trabalhadaor){
        return 120.0;
    }
}
