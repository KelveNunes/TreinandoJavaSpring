package org.contador.model;

import java.util.ArrayList;

public class Trabalhador {
    private String nome;
    private double taxa;
    private ArrayList<DiaTrabalhado>
            diasTrabalhados = new ArrayList<DiaTrabalhado>();

    public Trabalhador(ArrayList<DiaTrabalhado> diasTrabalhados) {}

    public Trabalhador(String nome, double taxa, ArrayList<DiaTrabalhado> diasTrabalhados) {
        this.taxa = taxa;
        this.nome = nome;
        this.diasTrabalhados = diasTrabalhados;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    public ArrayList<DiaTrabalhado> getDiasTrabalhados() {
        return diasTrabalhados;
    }
    public void addNovoDia (DiaTrabalhado horas){
        diasTrabalhados.add(horas);
    }
}
