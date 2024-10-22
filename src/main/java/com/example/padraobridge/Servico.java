package com.example.padraobridge;

public abstract class Servico {

    protected NivelExperiencia nivelExperiencia;

    protected float taxaBase;

    public Servico(float taxaBase) {
        this.taxaBase = taxaBase;
    }

    public void setNivelExperiencia(NivelExperiencia nivelExperiencia) {
        this.nivelExperiencia = nivelExperiencia;
    }

    public void setTaxaBase(float taxaBase) {
        this.taxaBase = taxaBase;
    }

    public abstract float calcularPagamento();
}
