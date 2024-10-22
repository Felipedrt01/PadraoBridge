package com.example.padraobridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConsultoriaTest {

    @Test
    public void testCalcularPagamento() {
        Consultoria consultoria = new Consultoria(150);

        consultoria.setNivelExperiencia(new Junior());
        consultoria.setHorasTrabalhadas(10);
        assertEquals(1500, consultoria.calcularPagamento());

        consultoria.setNivelExperiencia(new Pleno());
        assertEquals(1650, consultoria.calcularPagamento());

        consultoria.setNivelExperiencia(new Senior());
        assertEquals(1800, consultoria.calcularPagamento());

        consultoria.setNivelExperiencia(new Especialista());
        assertEquals(1950, consultoria.calcularPagamento());
    }
}
