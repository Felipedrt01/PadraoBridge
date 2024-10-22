package com.example.padraobridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LimpezaTest {

    @Test
    public void testCalcularPagamento() {
        Servico limpeza = new Limpeza(100);
        limpeza.setNivelExperiencia(new Junior());
        assertEquals(100, limpeza.calcularPagamento());

        limpeza.setNivelExperiencia(new Pleno());
        assertEquals(100, limpeza.calcularPagamento()); // Limpeza não depende do nível de experiência
    }
}
