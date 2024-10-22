package com.example.padraobridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReparacaoTest {

    @Test
    public void testCalcularPagamento() {
        Servico reparacao = new Reparacao(200);

        reparacao.setNivelExperiencia(new Junior());
        assertEquals(200, reparacao.calcularPagamento());

        reparacao.setNivelExperiencia(new Pleno());
        assertEquals(220, reparacao.calcularPagamento());

        reparacao.setNivelExperiencia(new Senior());
        assertEquals(240, reparacao.calcularPagamento());

        reparacao.setNivelExperiencia(new Especialista());
        assertEquals(260, reparacao.calcularPagamento());
    }
}
