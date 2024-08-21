package org.example.services;

import org.example.entities.DiaTrabalhado;
import org.example.entities.Trabalhador;

import java.util.ArrayList;

public class Calculos {


    public Calculos(){}
    public Calculos(Trabalhador trabalhador) {}


    public static Double calcularHoras(ArrayList<DiaTrabalhado> diasTrabalhados) {
        return 60.0;
    }

    public static Double calcularPaganento(Trabalhador trabalhadaor){
        return 120.0;
    }
}
