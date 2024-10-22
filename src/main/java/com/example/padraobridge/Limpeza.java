package com.example.padraobridge;

public class Limpeza extends Servico {

    public Limpeza(float taxaBase) {
        super(taxaBase);
    }

    public float calcularPagamento() {
        return this.taxaBase;
    }
}
