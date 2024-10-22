package com.example.padraobridge;

public class Consultoria extends Servico {

    private int horasTrabalhadas;

    public Consultoria(float taxaBase) {
        super(taxaBase);
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public float calcularPagamento() {
        return this.taxaBase * this.horasTrabalhadas * (1 + this.nivelExperiencia.percentualAumento());
    }
}
