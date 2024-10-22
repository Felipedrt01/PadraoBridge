package com.example.padraobridge;

public class Reparacao extends Servico {

    public Reparacao(float taxaBase) {
        super(taxaBase);
    }

    public float calcularPagamento() {
        return this.taxaBase * (1 + this.nivelExperiencia.percentualAumento());
    }
}
