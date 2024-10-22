package com.example.padraobridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NivelExperienciaTest {

    @Test
    public void testPercentualAumento() {
        NivelExperiencia junior = new Junior();
        assertEquals(0.0f, junior.percentualAumento());

        NivelExperiencia pleno = new Pleno();
        assertEquals(0.1f, pleno.percentualAumento());

        NivelExperiencia senior = new Senior();
        assertEquals(0.2f, senior.percentualAumento());

        NivelExperiencia especialista = new Especialista();
        assertEquals(0.3f, especialista.percentualAumento());
    }
}
